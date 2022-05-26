public class Main {

                                                            // Factory Method

    // avem 3 clase: PachetCazare, PachetTransport si PachetComplet
    // o interfata PachetTuristic cu o metoda afiseazaDetalii()
    // fiecare clasa va deriva interfata si va implementa metoda specifica
    // mai avem o interfata Factory cu o metoda crearePachet()
    // mai facem 3 clase: FactoryPachetCazare, FactoryPachetTransport, FactoryPachetComplet
    // in aceste 3 clase suprascriem metoda crearePachet() din interfata Factory
    // in Main facem un nou obiect de tip Factory x = new FactoryPachetCazare()
    // apoi pe x apelam metoda crearePachet();
    // apoi ar trebui sa se creeze un pachet de tip Cazare

    public static void main(String[] args){


        Factory pachetCazazre = new FactoryPachetCazazre();

        PachetTuristic pachetCazare = pachetCazazre.crearePachet();

        pachetCazare.afiseazaDetalii();



    }
}
