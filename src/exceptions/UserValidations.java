package exceptions;

import ro.ase.cts.lab02.Order;
import ro.ase.cts.lab02.Product;

import java.util.ArrayList;

public class UserValidations {

    public void orderAlreadyExist(Order order, ArrayList<Order> orders) {

        for (Order o : orders)
            if (o.equals(order))
                throw new Error("Comanda" + orders + "exista deja! :). Doriti sa recomandati produsele?");
    }

    public void availabilityOfProductInShop(Product product, ArrayList<Product> cart) {

        if (product.getQuantity() == numberOfEqualProducts(product, cart))
            throw new Error("Produsul nu mai exista in stoc");
    }
    // Intrebare: In cazul acesta ar fi fost corect sa las secventa aceasta de cod in functia de mai sus
    // sau e bine ca am extras o intr o functie separata?
    private int numberOfEqualProducts(Product product, ArrayList<Product> cart) {

        int numberOfEqualProducts = 0;
        for (Product p : cart)
            if (p.equals(product))
                numberOfEqualProducts++;
        return numberOfEqualProducts;
    }
}
