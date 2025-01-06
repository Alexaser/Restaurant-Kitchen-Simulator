package org.example;
/**
 * Constructs a new Order with the given customer and ID.
 *
 * @param customer the customer who placed the order
 * @param id the unique identifier for this order
 */

import java.util.Objects;

public class Order {
    private final Customer customer;
    private final int id;
    private StatusOrder statusOrder;
    public Order(Customer customer,int id) {
        this.customer=customer;
        this.id=id;
        statusOrder=StatusOrder.NEW;
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
                '}';
    }
}
