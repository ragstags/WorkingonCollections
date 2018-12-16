package com.collection;

/**
 * Created by nadimchouglay on 14/09/2017.
 */
public class Vehicle {
    String make;
    String model;
    int price ;
    boolean fourwheeldrive;

    public Vehicle( String make, String model, int price,boolean fourwheeldrive) {
        this.fourwheeldrive = fourwheeldrive;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourwheeldrive=" + fourwheeldrive +
                '}';
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isFourwheeldrive() {
        return fourwheeldrive;
    }

    public void setFourwheeldrive(boolean fourwheeldrive) {
        this.fourwheeldrive = fourwheeldrive;
    }
}
