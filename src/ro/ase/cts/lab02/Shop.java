package ro.ase.cts.lab02;

import exceptions.ProductValidations;
import exceptions.ShopValidations;

import java.util.ArrayList;

public class Shop {

    private final ShopValidations shopValidations = new ShopValidations();
    private String name;
    private String image;
    private final ArrayList<Product> products;

    Shop(String name, String image, ArrayList<Product> products) {
        this.products = new ArrayList<>(products);
        this.image = image;
        this.name = name;
    }

    public void addProduct(Product product) {
        shopValidations.productAlreadyExists(product, products);
        this.products.add(product);
    }

    public void removeProduct(Product product) {
        shopValidations.productDoesNotExist(product, products);
        this.products.remove(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Shop{" +
                ", name='" + name + '\'' +
                ", image='" + image + '\'' +
                ", products=" + products +
                '}';
    }
}
