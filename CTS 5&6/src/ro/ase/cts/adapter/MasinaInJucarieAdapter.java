package ro.ase.cts.adapter;

public class MasinaInJucarieAdapter implements Masina{
    JucarieMobila masina;

    public MasinaInJucarieAdapter(JucarieMobila masina) {
        this.masina = masina;
    }

    @Override
    public void claxoneaza() {
        this.masina.emiteSunete();
    }

    @Override
    public void ruleaza() {
        this.masina.seDeplaseaza();
    }
}
