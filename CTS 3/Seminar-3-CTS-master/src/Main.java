public class Main {

    public static void main(String[] args){

        OnlineShop os = OnlineShop.getInstance();

        OnlineShop os1 = OnlineShop.getInstance();

        // setam campul info pentru obiectul os1
        os1.setInfo("altceva");

        // iar acum o sa se modifice si pentru obiectul os

        System.out.println(os1.getInfo());
        System.out.println(os.getInfo());   // va fi tot altceva pt ca o sa aiba aceeasi adresa de memorie


























    }


}
