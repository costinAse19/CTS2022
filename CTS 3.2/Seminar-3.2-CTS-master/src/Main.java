public class Main {

                                                                                // II. Simple Factory

    // trebuie sa avem doua clase (MasinaClasica si MasinaElectrica) care implementeaza aceeasi interfata de baza (interfata Masina) cu o metoda simpla
    // mai facem o clasa FactoryMasina o sa aiba o metoda statica de creeare a obiectelor de tip masina (createCar de exemplu)
    // acea metoda trebuie sa primeasca un parametru prin care sa si dea seama ce tip de masina sa creeze
    // in metoda verificam cu if daca e masina electrica => creem obiect de tip MasinaElectrica, altfel => crem obiect de tip MasinaClasica
    // aceasta metoda va returna mereu tipul Masina, obiect de baza

    public static void main(String[] args){

        Masina m1 = FactoryMasina.createCar("Clasica");

        m1.showInfo();

        Masina m2 = FactoryMasina.createCar("Electrica");

        m2.showInfo();
    }





}
