package exceptions;

import ro.ase.cts.lab02.Product;

import java.util.ArrayList;

public class ShopValidations {

    public void productAlreadyExists(Product product, ArrayList<Product> products) {

        for (Product p : products)
            if (p.equals(product))
                throw new Error("Produsul" + product + "exista deja! :)");
    }

    public void productDoesNotExist(Product product, ArrayList<Product> products) {

        if (!products.contains(product))
            throw new Error("Produsul" + product + "nu se afla in lista :(");
    }

}
