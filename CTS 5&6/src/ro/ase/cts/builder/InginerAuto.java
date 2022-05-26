package ro.ase.cts.builder;

public class InginerAuto {
   Builder builder;

    public InginerAuto(String builderName) throws Exception {
        if(builderName.equalsIgnoreCase("Autoturism")){
            this.builder = new AutoturismBuilder();
        } else if(builderName.equalsIgnoreCase("Camion")){
            this.builder = new CamionBuilder();
        } else throw new Exception();
    }

    public void buildAutomobil(){
       builder.addInterior().addMotor().addRoti().addProducator().addSasiu();
    }
    public Automobil getAutomobil(){
        return builder.getAutomobil();
    }
}
