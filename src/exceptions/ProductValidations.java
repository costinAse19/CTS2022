package exceptions;

public class ProductValidations {

    public void priceAdditionValidation(float value) {

        if (value <= 0)
            throw new IllegalArgumentException("Valoarea introdusa nu corespunde criteriilor:\n" +
                    "value > 0");
    }

    public void priceSubtractionByValueValidation(float value, float price) {

        if (value <= 0 || value > price)
            throw new IllegalArgumentException("Valoarea introdusa nu corespunde criteriilor:\n" +
                    "value > 0 && value < price");
    }

    public void priceSubtractionByPercentageValidation(float value, float price) {

        if (value <= 0 || value * 100 / price > 100)
            throw new IllegalArgumentException("Valoarea introdusa nu corespunde criteriilor:\n" +
                    "value > 0 && value*100/price<100");
    }

}
