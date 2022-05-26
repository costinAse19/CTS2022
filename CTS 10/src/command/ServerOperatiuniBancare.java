package command;

import java.util.ArrayList;
import java.util.List;

public class ServerOperatiuniBancare {
    private static ServerOperatiuniBancare instance = null;
    private ServerOperatiuniBancare(){ }
    private List<OperatiuniBancare> op = new ArrayList<>();

    public static ServerOperatiuniBancare getInstance(){
        if(instance == null)
            instance = new ServerOperatiuniBancare();
        
        return instance;
    }
    public void inregistreazaOperatiune(OperatiuniBancare op){
        this.op.add(op);
    }
    public void prelucrareOperatiuni(){
           for(OperatiuniBancare o : op){
                o.efectuareOperatiune();
            }
       
    }
}
