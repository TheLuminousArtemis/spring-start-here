package com.ch8_ex5.ch8_ex5;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.ch8_ex5.ch8_ex5.service.ProductService;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model){
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping(value = "/products")
    public String addProduct(Product p,Model model){
        productService.addProduct(p);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
