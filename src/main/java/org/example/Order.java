/**
 * Constructs a new Order with the given customer and ID.
 *
 * @param customer the customer who placed the order
 * @param id the unique identifier for this order
 */

package org.example;
import java.util.Objects;

public class Order {
    private final Customer customer;
    private static int counterId = 0;
    private final int id = counterId++;
    private StatusOrder statusOrder;
    private final Waiter waiter;

    public Order(Customer customer,Waiter waiter) {
        this.customer = customer;
        statusOrder = StatusOrder.NEW;
        this.waiter=waiter;
    }

    public StatusOrder getStatusOrder() {
        return statusOrder;
    }

    public void setStatusOrder(StatusOrder statusOrder) {
        this.statusOrder = statusOrder;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
}

    public Waiter getWaiter() {
        return waiter;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (!Objects.equals(customer, order.customer)) return false;
        return statusOrder == order.statusOrder;
    }

    @Override
    public int hashCode() {
        int result = customer != null ? customer.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (statusOrder != null ? statusOrder.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", id=" + id +
                ", statusOrder=" + statusOrder +
                ", waiter=" + waiter +
                '}';
    }
}
