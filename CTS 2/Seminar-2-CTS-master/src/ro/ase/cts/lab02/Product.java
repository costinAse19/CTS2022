package ro.ase.cts.lab02;

class Product
{
    private int id;
    private String name;
    private double price;
    private String description; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public boolean equals(Product product)
    {

        if(product.id != this.id && (!product.name.equals(this.name)) && (product.price != this.price))
            return false;
        return true;

    }

    public double applyPercentageDiscount(float discountPercentage){

        return this.price -=this.price *discountPercentage/100;


    }

    public double applyAmountDiscount(double discountAmount){

        return this.price -=this.price *discountAmount;


    }

    public double increasePricePercentage(double discountPercentage){

        return this.price +=this.price *discountPercentage;


    }


    public double increasePriceAmount(double discountAmount){

        return this.price +=this.price *discountAmount;


    }



}
