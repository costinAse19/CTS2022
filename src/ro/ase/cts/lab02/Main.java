package ro.ase.cts.lab02;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Shop o = new Shop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5F, 1, 1, 1123, "");
        Product p2 = new Product("Frigider", 207.95F, 1, 2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setProdName("Paine");

        o.addProduct(p1);
        o.addProduct(p2);

        o.removeProduct(p1);
        System.out.println(p1.equals(p2));

        //demonstrativ
        User user = new User("Catalina.nicolae");
        //String name, float price, int type, int category, int quantity, String description
        user.addProductToCart(new Product("pizza",20.5F,1,1,100,""));
        user.addOrderToHistory(new Order());
        user.getOrders().get(0).setAddress("Bucuresti");

        System.out.println(user);
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println(o);
    }
}