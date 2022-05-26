package ro.ase.cts.proxy;

public class InternetProvider implements Internet{
    @Override
    public void connectTo(String site) {
        System.out.println("Accesare "+site+"...");
    }
}
