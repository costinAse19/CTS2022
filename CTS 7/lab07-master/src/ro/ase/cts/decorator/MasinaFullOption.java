package ro.ase.cts.decorator;

public class MasinaFullOption implements IMasina{
    @Override
    public void pornesteMotorul() {
        System.out.println("Motorul porneste...");
        incalzesteScaune();
    }
    public void incalzesteScaune(){
        System.out.println("Se porneste incalzirea scaunelor...");
    }
}
