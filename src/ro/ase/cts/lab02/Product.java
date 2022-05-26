package ro.ase.cts.lab02;

import exceptions.ProductValidations;

import java.util.Objects;
import java.util.UUID;

public class Product {

    private final ProductValidations productValidations = new ProductValidations();
    private UUID id = UUID.randomUUID();//am folosit uuid pt ca Id-ul sa fie mereu unic,
    // pentru a evita posibilitatea ca doua produse cu atribute difrite sa aiba acelasi id.

    private String name;
    private float price; //am schimbat din double in float pentru a salva memorie,
    // gandindu-ma la faptul ca double este pt valori foarte mari si banuiesc ca preturile nu vor fi exagerat de mari
    //Float.MAX_VALUE = 3.4028235E38
    //Double.MAX_VALUE = 1.7976931348623157E308
    private int type;
    private int category;
    private int quantity;
    private String description;

    public Product(String name, float price, int type, int category, int quantity, String description) {

        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.quantity = quantity;
        this.description = description;
    }

    public Product(Product p) {
        this.name = p.name;
        this.price = p.price;
        this.type = p.type;
        this.category = p.category;
        this.quantity = p.quantity;
        this.description = p.description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProdName() {
        return name;
    }

    public void setProdName(String prodName) {
        this.name = prodName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product p = (Product) o;
        // am exclus id-ul din comparatie, deoarece equals nu are trebui sa returneze false
        // pentru 2 obiecte care au toate atributele la fel cu exceptia id-ului
        return p.name.equals(this.name) && p.price == this.price && p.category == this.category;
    }

    public void addByValue(float value) {
        productValidations.priceAdditionValidation(value);
        this.price += value;
    }

    public void addByPercentage(float value) {
        productValidations.priceAdditionValidation(value);
        this.price = this.price + this.price * value / 100;
    }

    public void subtractByValue(float value) {
        productValidations.priceSubtractionByValueValidation(value, this.price);
        this.price -= value;
    }

    public void subtractByPercentage(float value) {
        productValidations.priceSubtractionByPercentageValidation(value, this.price);
        this.price = this.price - this.price / value / 100;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", category=" + category +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
