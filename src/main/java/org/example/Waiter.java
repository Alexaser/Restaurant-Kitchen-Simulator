package org.example;

import java.util.Random;

public class Waiter implements Runnable { //офик

    private static int countId = 0;
    private final int id = countId++;
    private Restaurant restaurant;
    private Customer customer;
    Random random = new Random(50);


    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Иду встречать гостя");
//            customer = restaurant.getCustomerOfHold().get(1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void hello() {
        System.out.println(this + " Принимает заказ гостя");
    }
}