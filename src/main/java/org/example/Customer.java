package org.example;

import java.util.Date;

public class Customer implements Runnable{
    public Customer() {

    }

    @Override
    public void run() {
        System.out.println(this + " Пришел в ресторан");
        try {
            Thread.sleep(400);
            System.out.println(this +" Собираюсь делать заказ");
            Thread.sleep(1100);
            System.out.println(this +" Делаю заказ");
            Thread.sleep(4000);
            System.out.println(this +" Кушаю");
            Thread.sleep(4000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }



    }
}
