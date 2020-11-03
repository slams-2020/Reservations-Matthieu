package net.reservations.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.reservations.models.Product;
import net.reservations.models.User;
import net.reservations.repositories.ProductRepository;

@Controller
@RequestMapping("product")
public class productController {
	
	@Autowired
    private ProductRepository urepo;
	
	@Autowired
    private ProductRepository prepo;
	
	@PostMapping("new")
    @ResponseBody
    public String addProduc(Product products) {
        prepo.saveAndFlush(products);
        return products + "ajoutée.";
    }
	
	@RequestMapping("produc/{id}")
	public @ResponseBody String getProduc(@PathVariable int idProduct) {
		Optional<Product> opt=prepo.findById(idProduct);
		if (opt.isPresent()) {
			return opt.get()+"";
		}
		return "Produit non trouvé";
	}
	
	@RequestMapping("user/new/{name}/{userName}")
		public @ResponseBody String addProduc(@PathVariable String name, @PathVariable String userName) {
			User user = urepo.findByTitle(userName);
			if (user != null) {
				Product products = new Product();
				products.setTitle(name);
				products.setUser(user);
				prepo.saveAndFlush(products);
				return products + "ajouté";
			}
			return "User" + userName + "inexistant";
	}
}
	

