package com.example.labexamcicd;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Max(value=100,message="The max number of characters is 100")
    private String productName;
    @Pattern(regexp = "PROD-",message="The Product Code has to follow the format 'PROD-XXXX'")
    private String productCode;

    private String category;
    private int quantityInStock;
    private int id;
    private double price;
}
