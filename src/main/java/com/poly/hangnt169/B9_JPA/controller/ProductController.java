package com.poly.hangnt169.B9_JPA.controller;

import com.poly.hangnt169.B9_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/hienthiproduct")
    public String hienThiProduct(Model model){
        model.addAttribute("listds",productService.getAll());
        return "/buoi10/hienthi";
    }
}
