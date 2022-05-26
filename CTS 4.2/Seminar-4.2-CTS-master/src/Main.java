import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Copac copac2 = new Copac("Coroana2", 20, "Maro", "Familie1", new Locatie(2,3));

        List<Copac> livada = new ArrayList<Copac>();

        livada.add(copac2);

        Copac copac3 = copac2.clone();

        livada.add(copac3);

        Locatie loc = new Locatie(4,5);
        copac3.planteaza(loc);

        System.out.println(livada);

    }



}
