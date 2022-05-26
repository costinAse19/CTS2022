package ro.ase.cts.decorator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<IMasina> arrayList = new ArrayList<>();
        for(int i=0;i<5;i++){
            if(i%2==0){
                arrayList.add(new MasinaClasica());
            }else{
                arrayList.add(new MasinaFullOption());
            }
        }
        for(IMasina iMasina : arrayList){
            iMasina.pornesteMotorul();
            System.out.println("\n");
        }
    }
}
