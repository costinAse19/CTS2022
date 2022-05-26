package ro.ase.cts.lab02;

import exceptions.OrderValidations;

import java.util.ArrayList;
import java.util.Objects;

public class Order {

    private ArrayList<Product> list;
    private String address;
    private final OrderValidations validations = new OrderValidations();

    public Order() {
        list = new ArrayList<>();
    }


    public Order(ArrayList<Product> list, String address) {
        this.list = list;
        this.address = address;
    }

    public void addProductToOrder(Product p) {
        validations.maximumNumberOfProducts(list.size());
        list.add(p);
    }

    public void remove(Product p) {
        validations.productDoesNotExistInOrder(this, p);
        list.remove(p);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Objects.equals(list, order.list) && Objects.equals(getAddress(), order.getAddress()) && Objects.equals(validations, order.validations);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Order{" +
                "list=" + list +
                ", address='" + address + '\'' +
                '}';
    }
}
