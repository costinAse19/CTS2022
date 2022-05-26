package ro.ase.cts.adapter;

public class MasinaPersonala implements Masina {

    @Override
    public void claxoneaza() {
        System.out.println("Viteza dvs. este de 100 km/h.");
    }

    @Override
    public void ruleaza() {
        System.out.println("Tiiit tiiit!!!");
    }
}
