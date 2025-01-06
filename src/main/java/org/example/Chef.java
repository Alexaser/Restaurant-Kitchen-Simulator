package org.example;

public class Chef implements Runnable {
    private int id;
    private int orders = 0;
    private Restaurant restaurant;

    public Chef(int name, Restaurant restaurant) {
        this.id = name;
    }

    public int getOrders() {
        return this.orders;
    }

    public void setOrders(int count) {
        this.orders += count;
    }

    public void run() {

    }

}
