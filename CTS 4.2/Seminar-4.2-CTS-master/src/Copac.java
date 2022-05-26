public class Copac implements Cloneable{

    public String tipCoroana;
    public int inaltime;
    public String culoare;
    public String familie;
    public Locatie locatiePlantare;

    public Copac(String tipCoroana, int inaltime, String culoare, String familie, Locatie locatiePlantare) {
        this.tipCoroana = tipCoroana;
        this.inaltime = inaltime;
        this.culoare = culoare;
        this.familie = familie;
        this.locatiePlantare = locatiePlantare;
    }

    public void planteaza(Locatie locatie){

        this.locatiePlantare = locatie;
    }

    @Override
    public String toString() {
        return "Copac{" +
                "tipCoroana='" + tipCoroana + '\'' +
                ", inaltime=" + inaltime +
                ", culoare='" + culoare + '\'' +
                ", familie='" + familie + '\'' +
                ", locatiePlantare=" + locatiePlantare +
                '}';
    }

    public Copac() {

    }

    @Override
    public Copac clone() throws CloneNotSupportedException {

        Copac copie = new Copac();

        copie.tipCoroana = this.tipCoroana;
        copie.inaltime = this.inaltime;
        copie.culoare = this.culoare;
        copie.familie = this.familie;
        copie.locatiePlantare = this.locatiePlantare;

        return copie;


    }
}
