package org.example;

import java.util.Random;

public class Chef implements Runnable {
    private final int id = countId++;
    private static int countId = 0;
    private static Random random = new Random(50);
    private Restaurant restaurant;

    public Chef(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                Order order = restaurant.orders.take();
                order.setStatusOrder(StatusOrder.ACCEPTED);

                Thread.sleep(random.nextInt(500));

                order.setStatusOrder(StatusOrder.READY);

            }
        } catch (InterruptedException e) {
            System.out.println(this + " Interrupted");
        }catch (Exception e){
            System.out.println(this + " Exception");
        }
    }


}
