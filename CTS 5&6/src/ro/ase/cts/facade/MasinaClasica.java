package ro.ase.cts.facade;

public class MasinaClasica extends Masina{
    private String aditiv;

    public MasinaClasica(String sasiu, String producator, String culoare,String aditiv) {
        super(sasiu, producator, culoare);
        this.aditiv=aditiv;
    }

    @Override
    public String getDetails() {
        return "Masina "+culoare+" clasica de la "+producator+ " cu sasiul "+sasiu+
                " are ca aditiv: "+aditiv+".";
    }
}
