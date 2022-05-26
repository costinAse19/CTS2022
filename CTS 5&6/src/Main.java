import ro.ase.cts.adapter.JucarieInMasinaAdapter;
import ro.ase.cts.adapter.MasinaInJucarieAdapter;
import ro.ase.cts.adapter.MasinaJucarie;
import ro.ase.cts.adapter.MasinaPersonala;
import ro.ase.cts.builder.Automobil;
import ro.ase.cts.builder.InginerAuto;
import ro.ase.cts.facade.DealerAuto;
import ro.ase.cts.proxy.Internet;
import ro.ase.cts.proxy.InternetProxy;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void connectYoutube(Internet internet, String site){
        internet.connectTo(site);
    }
    public static void main(String[] args) throws Exception {
        // Builder
        InginerAuto a1 = new InginerAuto("Camion");
        a1.buildAutomobil();
        Automobil camion = a1.getAutomobil();
        System.out.println(camion);

        InginerAuto a2 = new InginerAuto("Autoturism");
        a2.buildAutomobil();
        Automobil autoturism = a2.getAutomobil();
        System.out.println(autoturism);

        System.out.println("\n-------------------------------------------------\n");

        // Adapter
        MasinaPersonala masinaPersonala = new MasinaPersonala();
        System.out.println("Masina personala:");
        masinaPersonala.claxoneaza();
        masinaPersonala.ruleaza();
        System.out.println("\n");

        MasinaJucarie masinaJucarie = new MasinaJucarie();
        System.out.println("Masina jucarie:");
        masinaJucarie.seDeplaseaza();
        masinaJucarie.emiteSunete();
        System.out.println("\n");

        MasinaInJucarieAdapter masinaInJucarieAdapter = new MasinaInJucarieAdapter(masinaJucarie);
        System.out.println("Din masina in jucarie");
        masinaInJucarieAdapter.ruleaza();
        masinaInJucarieAdapter.claxoneaza();
        System.out.println("\n");

        JucarieInMasinaAdapter jucarieInMasinaAdapter = new JucarieInMasinaAdapter(masinaPersonala);
        System.out.println("Din jucarie in masina");
        jucarieInMasinaAdapter.emiteSunete();
        jucarieInMasinaAdapter.seDeplaseaza();

        System.out.println("\n-------------------------------------------------\n");

        //Facade
        DealerAuto dealerAuto = new DealerAuto();
        System.out.println(dealerAuto.getDetailsClasic());
        System.out.println(dealerAuto.getDetailsElectric());
        System.out.println(dealerAuto.getDetailsHybrid());

        System.out.println("\n-------------------------------------------------\n");

        //Proxy
        Internet internet = new InternetProxy();
        internet.connectTo("www.abc.com");
        internet.connectTo("www.ase.ro");
        connectYoutube(internet,"www.abc.com");

        List<String> culori = Arrays.asList("negru","rosu");
        // cand vom avea nevoie de o masina rosie, vedem daca exista una si o extrag, altfel
        // creez si extrag
    }
}
