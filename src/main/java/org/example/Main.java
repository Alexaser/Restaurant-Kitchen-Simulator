package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();

        Restaurant restaurant = new Restaurant(service, 2, 5);

//        for(int i=0;i<10;i++){
            service.execute(restaurant);
//        }
//        service.shutdown();
    }
}