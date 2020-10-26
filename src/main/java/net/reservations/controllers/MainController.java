package net.reservations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.github.jeemv.springboot.vuejs.VueJS;
import io.github.jeemv.springboot.vuejs.utilities.Http;
import io.github.jeemv.springboot.vuejs.utilities.JsArray;

	@Controller
	public class MainController {

		@Autowired
		private VueJS vue;

		private String restURL = "http://127.0.0.1:8091/";

		@ModelAttribute(name = "vue")
		private VueJS getVue() {
			return this.vue;
		}

		@RequestMapping("/prods")
		public String index(ModelMap model) {
			vue.addDataRaw("prods", "[]");
			vue.addDataRaw("produc", "{}");
			vue.addDataRaw("pProduct", "{}");
			vue.addData("dialog", false);
			vue.addData("isNew", false);
			vue.addData("message", false);

			vue.addComputed("dialogTitle", "return this.isNew?'Nouveau Produit':'Mise à jour';");

			vue.onBeforeMount("let self=this;" + Http.get(restURL + "products", "self.prods=response.data;"));

			vue.addMethod("addProduc", "let self=this;" + Http.post(restURL + "products", "self.produc", "self.prods.push(response.data);self.dialog=false;self.showMsg('success','Product '+self.produc.title+' ajoutée !');", "self.showMsg('error',response);"));

			vue.addMethod("editProduc", "this.dialog=true;this.pProduct=produc;this.produc=Object.assign({},produc);this.isNew=false;", "produc");

			vue.addMethod("updateProduc", "let self=this;" + Http.patch("'" + restURL + "products/'+self.produc.id", "self.produc", "Object.assign(self.pProduct, self.produc);self.dialog=false;self.showMsg('info','Product '+self.produc.title+' modifiée !')", "console.log(response);"), "produc");

			vue.addMethod("deleteProduc", "let self=this;" + Http.delete("'" + restURL + "products/'+produc.id", JsArray.remove("self.prods", "produc")) + ";self.showMsg('warning','Product '+produc.title+' supprimée !');", "produc");

			vue.addMethod("showMsg", "this.message={'type':type,'content':content};", "type", "content");

			return "index";
		}
	}
// org = prod
// orgas = prods
// orga = produc
// Orga = Produc
// organizations = products
// Organisation = Product
// oOrga = pProduct