package ro.ase.cts.adapter;

public class MasinaJucarie implements JucarieMobila{
    @Override
    public void seDeplaseaza() {
        System.out.println("Se deplaseaza cu 0.01 km/h.");
    }

    @Override
    public void emiteSunete() {
        System.out.println("Canta o melodie...nanana.");
    }
}
