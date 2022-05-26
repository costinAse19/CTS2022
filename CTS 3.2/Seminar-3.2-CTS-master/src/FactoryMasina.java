public class FactoryMasina {

    public static Masina createCar(String tip){

        if(tip.equals("Clasica")){

            Masina m1 = new MasinaClasica();

            return m1;
        }
        else if(tip.equals("Electrica")){

            Masina m2 = new MasinaElectrica();

            return m2;
        }
        else{

            return null;
        }
    }









}
