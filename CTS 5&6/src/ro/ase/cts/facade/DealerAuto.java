package ro.ase.cts.facade;

public class DealerAuto {
    MasinaClasica masinaClasica;
    MasinaElectrica masinaElectrica;
    MasinaHybrid masinaHybrid;

    public DealerAuto(){
        masinaClasica = new MasinaClasica("cl239393","audi","gri","plumb");
        masinaElectrica = new MasinaElectrica("el239393","Dacia","gri",400);
        masinaHybrid= new MasinaHybrid("hi292929","bmw","negru",true);
    }
    public String getDetailsClasic(){
       return masinaClasica.getDetails();
    }
    public String getDetailsElectric(){
        return masinaElectrica.getDetails();
    }
    public String getDetailsHybrid(){
        return masinaHybrid.getDetails();
    }

}
