package ro.ase.cts.facade;

public abstract class Masina {
    protected String sasiu;
    protected String producator;
    protected String culoare;

    public Masina(String sasiu, String producator, String culoare) {
        this.sasiu = sasiu;
        this.producator = producator;
        this.culoare = culoare;
    }

    public abstract String getDetails();
}
