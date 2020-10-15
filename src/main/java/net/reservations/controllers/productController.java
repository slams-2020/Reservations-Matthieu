package net.reservations.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.reservations.models.Product;
import net.reservations.repositories.ProductRepository;

@Controller
@RequestMapping("/product/")
public class productController {
	
	@Autowired
    private ProductRepository repo;
	
	@PostMapping("new")
    @ResponseBody
    public String newProduct(Product products) {
        repo.saveAndFlush(products);
        return products+" ajoutée.";
    }
}
