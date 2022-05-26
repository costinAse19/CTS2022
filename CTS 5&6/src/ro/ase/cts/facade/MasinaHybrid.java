package ro.ase.cts.facade;

public class MasinaHybrid extends Masina{
    private boolean plugIn;

    public MasinaHybrid(String sasiu, String producator, String culoare,boolean plugIn) {
        super(sasiu, producator, culoare);
        this.plugIn = plugIn;
    }

    @Override
    public String getDetails() {
        return "Masina "+culoare+" hibrid de la "+producator+ " cu sasiul "+sasiu+
                (plugIn?" ":" nu ")+"este plug-in.";
    }
}
