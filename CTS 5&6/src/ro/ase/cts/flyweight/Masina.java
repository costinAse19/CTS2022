package ro.ase.cts.flyweight;

public class Masina implements FlyWeightMasina{
    protected String sasiu;
    protected String producator;
    protected String culoare;

    public Masina(String sasiu, String producator, String culoare) {
        this.sasiu = sasiu;
        this.producator = producator;
        this.culoare = culoare;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public void afiseaza() {
        System.out.println("Masina de culoare "+culoare+" de la "+producator+ " cu sasiul "+sasiu+".");
    }
}
