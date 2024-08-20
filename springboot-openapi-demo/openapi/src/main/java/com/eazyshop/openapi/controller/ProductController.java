package com.eazyshop.openapi.controller;

import com.eazyshop.openapi.model.Category;
import com.eazyshop.openapi.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

  @GetMapping("/products")
  public List<Product> getProducts(@RequestParam(required = false) int categoryId) {
    List<Product> products = new ArrayList<>();
    return products;
  }

  @GetMapping("/products/{productId}")
  public Product getProductDetails(@PathVariable int productId) {
    Product product = new Product();
    return product;
  }

}
