package ro.ase.cts.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternetProxy implements Internet{
    private List<String> blackList;
    private InternetProvider provider = new InternetProvider();

    public InternetProxy(){
        blackList = new ArrayList<>();
        blackList.add("www.abc.com");
    }
    private void addToBlackList(String url){
        blackList.add(url);
    }
    private void removeFromBlackList(String url){
        blackList.remove(url);
    }
    @Override
    public void connectTo(String site) {
        if(blackList.contains(site)){
            System.out.println("Imposibil de accesat "+site+"!");
        }else {
            provider.connectTo(site);
        }
    }
}
