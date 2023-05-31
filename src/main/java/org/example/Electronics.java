package org.example;

public class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(int id, String name, double price, int quantity, String brand, String model) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Electronics{" + " id = '" + getId() + '\'' +
                " name = '" + getName() + '\'' +
                " price = '" + getPrice() + '\'' +
                " quantity = '" + getQuantity() + '\'' +
                " brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                '}';
    }
}
