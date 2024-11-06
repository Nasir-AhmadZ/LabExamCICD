package com.example.labexamcicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    Product product;
    ProductService myProduct;

    @GetMapping("/products/{code}")
    public List<Product> getProduct(@PathVariable String code)
    {
        return myProduct.getProduct(code);
    }

    @PostMapping("/products")
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        this.product = product;
        return myProduct.newProduct(product);
    }

    @PutMapping("/products/{code}")
    public List<Product> updateProduct(@PathVariable String code,@RequestBody Product product)
    {
        return myProduct.updateProduct(code,product);
    }

    @DeleteMapping("/products/{code}")
    public List<Product> deleteProduct(@PathVariable String code)
    {
        return myProduct.deleteProduct(code);
    }

}
