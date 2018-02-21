package edu.wctc.dj.week4.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductService {

    private List<Product> productList = Arrays.asList(
            new Product("1", "Trek", "Trek Madone 9.9", "The bike the Pros ride!", "1478000_2018_A_1_MADONE_9_9_C_H2.jpg", 11999.99, "bicycle"),
            new Product("2", "Trek", "Domane SLR 9 Disc", "Our most comfortable bike, now with disc brakes.", "1477400_2018_D_1_Domane_SLR_8_Disc.jpeg", 10100.88, "bicycle"),
            new Product("3", "Trek", "Boone 7 Disc", "Our lightest XC bike to date!", "2466000_2018_A_1_Boone_7_Disc.jpeg", 7000.00, "bicycle"),
            new Product("4", "Twin Six", "The HC", "100% Soft Polyester Microfiber", "HC_F_2048x2048.jpg", 85.00, "clothing"),
            new Product("5", "Twin Six", "Boone 7 Disc", "850% Soft Polyester Microfiber", "ModSquad_F_2048x2048.jpg", 85.00, "clothing"),
            new Product("6", "Nashbar", "Nashbar 360 Repair Stand", "Cheap and light stand", "BN-WS360-NCL-TOP.jpg", 89.99, "accessory"),
            new Product("7", "Nashbar", "Nashbar Multi-11 Bike Tool", "All the tools you need", "BN-M11-NCL-TOP.jpg", 7.99, "accessory")
    );

    public Product getProduct(String prodId) {
        Product product = null;
        for (Product prod : productList) {
            if (prod.getProdId().equals(prodId)) {
                product = prod;
            }
        }
        return product;
    }

    public List<Product> getAllProducts() {
        return productList;
    }

    public List<Product> getAllLikeProducts(String type) {
        List<Product> tempList = new ArrayList<>();
        for (Product prod : productList) {
            if (prod.getType().equals(type)) {
                tempList.add(prod);
            }
        }
        return tempList;
    }

}
