package com.example.labexamcicd;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    public List myProduct = new ArrayList<>();
    public List getMyProduct = new ArrayList<>()

    public List<Product> getProduct(@PathVariable String Code)
    {

        for(int i=0; i<myProduct.size();i++)
        {
            if(myProduct.get(i)==Code)
            {
                getMyProduct.add(myProduct.get(i));
            }
        }
        return getMyProduct;

    }

    public List<Product> newProduct(@RequestBody Product product)
    {
        myProduct.add(product);
        return myProduct;
    }

    public List<Product> updateProduct(@PathVariable int id, @RequestBody Product product)
    {
        myProduct.set(id-1,product);
        return myProduct;
    }

    public List<Product> deleteProduct(@PathVariable int id)
    {
        myProduct.remove(id-1);
        return myProduct;
    }

}
