package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;

public class Restaurant implements Runnable {
    private List<Customer> customerOfHold = new ArrayList<>();
    //    private List<Chef> chefs = new ArrayList<>();
    BlockingDeque<Order> orders = new LinkedBlockingDeque<>();
    ArrayList<Customer> customers = new ArrayList<>();
    private Executor executor;
    private Waiter waiter;
    private Chef chef;
    private Random random = new Random(50);

    public Restaurant(Executor exec, int nChefs, int maxOrders) {
        this.executor = exec;

//        for (int i = 0; i < nChefs; ++i) {
        chef = new Chef(this);
        waiter = new Waiter(this);
        executor.execute(waiter);
//            chefs.add(chef);
        this.executor.execute(chef);
        System.out.println("шев и официант заступили на работу");
//        }
    }

    public void run() {
        System.out.println("Ждем появления гостей");
        while (!Thread.interrupted()) {

            Customer customer = new Customer();
            System.out.println("новый гость " + customer);
            executor.execute(customer);
            waiter.hello();
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
