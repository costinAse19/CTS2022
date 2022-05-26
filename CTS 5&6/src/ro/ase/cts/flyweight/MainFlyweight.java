package ro.ase.cts.flyweight;

public class MainFlyweight {
    public static void main(String[] args) {
        MasinaFactory factory = new MasinaFactory();
        Masina masinaGalbena = factory.getMasina("galbena");
        Masina masinaVerde = factory.getMasina("verde");
        masinaVerde.setProducator("bmw"); masinaVerde.setSasiu("bm555");
        Masina masinaRosie = factory.getMasina("rosie");
        masinaRosie.setProducator("vw"); masinaRosie.setSasiu("vw2555");
        Masina masinaGalbena1 = factory.getMasina("galbena");
        masinaGalbena1.setSasiu("ol000"); masinaGalbena1.setProducator("dacia");

        masinaGalbena.afiseaza();
        masinaVerde.afiseaza();
        masinaRosie.afiseaza();
        masinaGalbena1.afiseaza();
    }
}
