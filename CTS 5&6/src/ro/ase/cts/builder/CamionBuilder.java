package ro.ase.cts.builder;

public class CamionBuilder implements Builder{
    private String sasiu;
    private String producator;
    private int nrRoti;
    private Motor motor;
    private String interior;

    @Override
    public Builder addSasiu() {
        this.sasiu = "RO0339292991";
        return this;
    }

    @Override
    public Builder addProducator() {
        this.producator = "Honda";
        return this;
    }

    @Override
    public Builder addRoti() {
        this.nrRoti = 6;
        return this;
    }

    @Override
    public Builder addMotor() {
        this.motor = Motor.DIESEL;
        return this;
    }

    @Override
    public Builder addInterior() {
        this.interior="Piele";
        return this;
    }

    @Override
    public Automobil getAutomobil() {
        return new Automobil(sasiu,producator,nrRoti,motor,interior);
    }

}
