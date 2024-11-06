package com.example.labexamcicd;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
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
    @Pattern(regexp="Electronics",message = "Category must be Electronics, Apparel or Furniture")
    @Pattern(regexp="Apparel",message = "Category must be Electronics, Apparel or Furniture")
    @Pattern(regexp="Furniture",message = "Category must be Electronics, Apparel or Furniture")
    private String category;
    @PositiveOrZero(message="This can only be a non-negative integer")
    private int quantityInStock;
    @Positive(message="This can only be a positive number")
    private double price;
}
