public class OnlineShop {

                                                                // DESIGN PATTERNS
                                                                // I. SINGLETON

    // trebuie sa avem un constructor private
    // trebuie sa avem o metoda public static care sa creeze o instanta a clasei
    // trebuie sa avem un camp privat static de tipul clasei care va fi returnat in metoda statica

    private static OnlineShop instanta;
    private String info = "ceva";

    private OnlineShop(){



    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static OnlineShop getInstance(){

        if(OnlineShop.instanta != null){

            return OnlineShop.instanta;
        }
        else{

            OnlineShop.instanta = new OnlineShop();

            return OnlineShop.instanta;
        }

    }














}
