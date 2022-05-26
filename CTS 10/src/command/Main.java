package command;

public class Main {
    public static void main(String[] args) {
        ServerOperatiuniBancare server = ServerOperatiuniBancare.getInstance();

        OperatiuniBancare op1= new AlimentareCont("RO01",3456789);
        OperatiuniBancare op2= new TransferBancar("RO03",12356,"RO04");

        server.inregistreazaOperatiune(op1);
        server.inregistreazaOperatiune(op2);
        server.prelucrareOperatiuni();
        server.prelucrareOperatiuni();

    }
}
