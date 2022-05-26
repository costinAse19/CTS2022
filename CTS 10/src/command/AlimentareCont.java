package command;

public class AlimentareCont extends OperatiuniBancare{
    private float suma;

    public AlimentareCont(String cont,float suma) {
        super(cont);
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Contul "+cont+", "+suma+" RON.");
    }
}
