package memento;

import java.util.HashMap;
import java.util.Map;

public class VersionControl {
    public static int snapshotId = 1;
    private Map<Integer,FileSnapshot> versions = new HashMap<>();

    public void addSnapshot(FileSnapshot file){
        this.versions.put(snapshotId++,file);
    }

    public void listSnapshots(){
        for (Map.Entry<Integer,FileSnapshot> entry : versions.entrySet()) {
            System.out.println("Id: "+entry.getKey() + ", " + entry.getValue());
        }
    }
    public FileSnapshot getVersion(int id){
        if(versions.containsKey(id)){
            return versions.get(id);
        } else return null;
    }
}
