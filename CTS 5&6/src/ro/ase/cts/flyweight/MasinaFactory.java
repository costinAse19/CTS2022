package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {
    private Map<String,Masina> map = new HashMap<>();
    public Masina getMasina(String culoare){
        if(!map.containsKey(culoare)){
            Masina masina = new Masina("Ro0440","Audi",culoare);
            map.put(culoare,masina);
        }
        return map.get(culoare);
    }
}
