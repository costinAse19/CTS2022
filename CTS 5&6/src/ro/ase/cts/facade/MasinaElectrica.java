package ro.ase.cts.facade;

public class MasinaElectrica extends Masina {

    private float autonomieBaterie;

    public MasinaElectrica(String sasiu, String producator, String culoare,float autonomieBaterie) {
        super("Ro02989283","Dacia","alba");
        this.autonomieBaterie = autonomieBaterie;
    }

    @Override
    public String getDetails() {
        return "Masina "+culoare+" electrica de la "+producator+ " cu sasiul "+sasiu+
                " are autonomia bateriei de "+autonomieBaterie+" km.";
    }
}
