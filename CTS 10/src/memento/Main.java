package memento;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("first","V007");
        file1.print();
        FileSnapshot fs1 = file1.createSnapshot("number1");
        VersionControl system = new VersionControl();
        system.addSnapshot(fs1);
        system.listSnapshots();
        file1.setContent("second");
        file1.print();

        system.addSnapshot(file1.createSnapshot("number2"));

        file1.restoreFileContent(system.getVersion(1));
        file1.print();
    }
}
