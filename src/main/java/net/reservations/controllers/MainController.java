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

		@RequestMapping("/orgas")
		public String index(ModelMap model) {
			vue.addDataRaw("orgas", "[]");
			vue.addDataRaw("orga", "{}");
			vue.addDataRaw("oOrga", "{}");
			vue.addData("dialog", false);
			vue.addData("isNew", false);
			vue.addData("message", false);

			vue.addComputed("dialogTitle", "return this.isNew?'Nouvelle organisation':'Mise à jour';");

			vue.onBeforeMount("let self=this;" + Http.get(restURL + "organizations", "self.orgas=response.data;"));

			vue.addMethod("addOrga", "let self=this;" + Http.post(restURL + "organizations", "self.orga", "self.orgas.push(response.data);self.dialog=false;self.showMsg('success','Organisation '+self.orga.name+' ajoutée !');", "self.showMsg('error',response);"));

			vue.addMethod("editOrga", "this.dialog=true;this.oOrga=orga;this.orga=Object.assign({},orga);this.isNew=false;", "orga");

			vue.addMethod("updateOrga", "let self=this;" + Http.patch("'" + restURL + "organizations/'+self.orga.id", "self.orga", "Object.assign(self.oOrga, self.orga);self.dialog=false;self.showMsg('info','Organisation '+self.orga.name+' modifiée !')", "console.log(response);"), "orga");

			vue.addMethod("deleteOrga", "let self=this;" + Http.delete("'" + restURL + "organizations/'+orga.id", JsArray.remove("self.orgas", "orga")) + ";self.showMsg('warning','Organisation '+orga.name+' supprimée !');", "orga");

			vue.addMethod("showMsg", "this.message={'type':type,'content':content};", "type", "content");

			return "index";
		}
	}
}
