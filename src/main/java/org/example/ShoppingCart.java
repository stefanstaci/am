package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> products;

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        this.products.add(product);
        System.out.println("product " + product.getName() + " added successfully");
    }

    public void showProducts() {
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void showTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        System.out.println("Total price = " + totalPrice + " lei");
    }
}
