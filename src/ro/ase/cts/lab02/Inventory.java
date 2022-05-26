package ro.ase.cts.lab02;

public class Inventory {

    private Product product;
    private int quantity;

    public Inventory(Product product, int quantity) {
        this.product = new Product(product);
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
