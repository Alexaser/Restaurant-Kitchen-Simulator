package org.example;

public class Order {

    private Customer customer;
    private static int id;

    static {
        int id = 0;
    }


    public Order(Customer customer) {
        this.customer=customer;
        id++;
    }

    public static int getId() {
        return id;
    }
}
