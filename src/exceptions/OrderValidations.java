package exceptions;

import ro.ase.cts.lab02.Order;
import ro.ase.cts.lab02.Product;

public class OrderValidations {

    public void maximumNumberOfProducts(int size) {
        if (size > 99)
            throw new Error("Ati depasit nr maxim de produse admise");
    }

    public void productDoesNotExistInOrder(Order order, Product product) {
        // daca produsul nu exista in comanda, atunci nu are ce sa stearga si se arunca eroare
        if (!order.getList().contains(product))
            throw new Error("Produsul selectat nu exista in comanda!");
    }

}
