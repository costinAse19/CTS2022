package command;

public class TransferBancar extends OperatiuniBancare {
    private float suma;
    private String contDestinatie;

    public TransferBancar(String cont,float suma, String contDestinatie) {
        super(cont);
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Contul "+cont+", "+suma+" RON, "+contDestinatie+".");
    }
}
