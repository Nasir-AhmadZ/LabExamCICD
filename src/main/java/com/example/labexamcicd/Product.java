package com.example.labexamcicd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private String productName;
    private String productCode;
    private String category;
    private int quantityInStock;
    private int id;
    private double price;
}
