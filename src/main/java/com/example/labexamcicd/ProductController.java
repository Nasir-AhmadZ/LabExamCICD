package com.example.labexamcicd;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    Product product;
    ProductService myProduct;

    @GetMapping("/getProduct")
    public List<Product> getProduct()
    {
        return myProduct.getProduct();
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        this.product = product;
        return myProduct.newProduct(product);
    }

    @PutMapping("/{id}")
    public List<Product> updateProduct(@PathVariable int id,@RequestBody Product product)
    {
        return myProduct.updateProduct(id,product);
    }

    @DeleteMapping({"/{id}")
    public List<Product> deleteProduct(@PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }

}
