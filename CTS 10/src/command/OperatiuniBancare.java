package command;

public abstract class OperatiuniBancare { 
    protected String cont;

    public OperatiuniBancare(String cont) {
        this.cont = cont;
    }

    public abstract void efectuareOperatiune();
}
