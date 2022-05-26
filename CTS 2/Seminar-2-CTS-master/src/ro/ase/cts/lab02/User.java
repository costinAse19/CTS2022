package ro.ase.cts.lab02;

import java.util.ArrayList;

class User
{
    private String name;
    private String id;
    private ArrayList<Order> orders;
    private ArrayList<Order> unfinishedOrders;
    private ArrayList<Product> products;

    public User(String name, String id)
    {
        this.name = name;
        this.id = id;

    }

    public void addOrderToHistory(Order order)
    {
        this.orders.add(order);
    }


    public void addProductToUnfinishedOrders(Product product)
    {
        this.products.add(product);
    }
}