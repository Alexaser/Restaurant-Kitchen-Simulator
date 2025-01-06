package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;

public class Restaurant implements Runnable {
    private List<Customer> costomerOfHold = new ArrayList();
    private List<Chef> chefs = new ArrayList();
    private BlockingDeque<Order> orders = new LinkedBlockingDeque();
    private Executor executor;

    public Restaurant(Executor exec, int nChefs, int maxOrders) {
        this.executor = exec;

        for(int i = 0; i < nChefs; ++i) {
            Chef chef = new Chef(i + 1, this);
            chefs.add(chef);
            this.executor.execute(chef);
        }
    }

    public void run() {


    }
}
