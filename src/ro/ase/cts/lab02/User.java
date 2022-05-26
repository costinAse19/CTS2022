package ro.ase.cts.lab02;

import exceptions.UserValidations;

import java.util.ArrayList;
import java.util.UUID;

public class User {

    private UserValidations userValidations = new UserValidations();
    private String userName;
    private UUID id = UUID.randomUUID();
    private ArrayList<Order> orders;
    private ArrayList<Product> cart;

    public User(String userName) {
        this.userName = userName;
        orders = new ArrayList<>();
        cart = new ArrayList<>();
    }

    public void addOrderToHistory(Order o) {
        userValidations.orderAlreadyExist(o, orders);
        this.orders.add(o);
    }

    public void addProductToCart(Product p) {
        userValidations.availabilityOfProductInShop(p, cart);
        this.cart.add(p);
    }

    public UserValidations getUserValidations() {
        return userValidations;
    }

    public void setUserValidations(UserValidations userValidations) {
        this.userValidations = userValidations;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "User{" +
                ", userName='" + userName + '\'' +
                ", id='" + id + '\'' +
                ", orders=" + orders +
                ", cart=" + cart +
                '}';
    }
}
