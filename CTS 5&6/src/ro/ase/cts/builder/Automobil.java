package ro.ase.cts.builder;

enum Motor {
    DIESEL, OTTO
}

public class Automobil {
    private String sasiu;
    private String producator;
    private int nrRoti;
    private Motor motor;
    private String interior;

    public Automobil(String sasiu, String producator, int nrRoti, Motor motor, String interior) {
        this.sasiu = sasiu;
        this.producator = producator;
        this.nrRoti = nrRoti;
        this.motor = motor;
        this.interior = interior;
    }

    public String getSasiu() {
        return sasiu;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String getInterior() {
        return interior;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "sasiu='" + sasiu + '\'' +
                ", producator='" + producator + '\'' +
                ", nrRoti=" + nrRoti +
                ", motor=" + motor +
                ", interior='" + interior + '\'' +
                '}';
    }
}
