package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Electronics(
                1,
                "Laptop",
                9990,
                4,
                "Lenovo",
                "IdeaPad 3"
        );
        Product product2 = new Electronics(
                2,
                "Laptop",
                8490,
                3,
                "Acer",
                "Aspire 3"
        );
        Product product3 = new Electronics(
                3,
                "Smartphone",
                15499,
                5,
                "Apple",
                "Iphone 13"
        );
        Product product4 = new Electronics(
                4,
                "Smartphone",
                12499,
                4,
                "Xiaomi",
                "12T Pro 5G Dual Sim"
        );
        Product product5 = new Book(
                5,
                "Lovelight Farms",
                255,
                4,
                "B.K. BORISON",
                "Romance"
        );
        Product product6 = new Book(
                6,
                "Horse",
                320,
                2,
                "GERALDINE BROOKS",
                "Romance"
        );
        Product product7 = new Book(
                7,
                "Glasul de taina",
                200,
                5,
                "GERALDINE BROOKS",
                "Moderni"
        );
        Product product8 = new Book(
                8,
                "Impostorul",
                250,
                6,
                "JAVIER CERCAS",
                "Moderni"
        );

        List<Product> allProducts = new ArrayList<>();
        allProducts.add(product1);
        allProducts.add(product2);
        allProducts.add(product3);
        allProducts.add(product4);
        allProducts.add(product5);
        allProducts.add(product6);
        allProducts.add(product7);
        allProducts.add(product8);

        for (Product product : allProducts) {
            System.out.println(product.toString());
        }

        System.out.println("\nFor adding in Shopping cart enter the id of product");
        System.out.println("For view the contents of the Shopping cart enter /sc");
        System.out.println("to exit the program enter /q");

        Scanner scan = new Scanner(System.in);

        List<Product> productsCart = new ArrayList<>();
        ShoppingCart shoppingCart = new ShoppingCart(productsCart);

        while (true) {
            String c = scan.nextLine();
            if (Objects.equals(c, "/sc")) {
                shoppingCart.showProducts();
                shoppingCart.showTotalPrice();
            }

            for (Product product : allProducts) {
                if (c.equals(String.valueOf(product.getId()))) {
                    shoppingCart.addProduct(product);
                }
            }
            if (c.equals("/q")) {
                break;
            }
        }
    }
}