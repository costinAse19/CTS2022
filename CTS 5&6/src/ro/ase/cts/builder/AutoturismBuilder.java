package ro.ase.cts.builder;

public class AutoturismBuilder implements Builder{
    private String sasiu;
    private String producator;
    private int nrRoti;
    private Motor motor;
    private String interior;

    @Override
    public Builder addSasiu() {
        this.sasiu = "AU00020";
        return this;
    }

    @Override
    public Builder addProducator() {
        this.producator="Audi";
        return this;
    }

    @Override
    public Builder addRoti() {
        this.nrRoti=4;
        return this;
    }

    @Override
    public Builder addMotor() {
        this.motor=Motor.OTTO;
        return this;
    }

    @Override
    public Builder addInterior() {
        this.interior="Piele alba";
        return this;
    }

    @Override
    public Automobil getAutomobil() {
        return new Automobil(sasiu,producator,nrRoti,motor,interior);
    }

}
