package ro.ase.cts.strategy;

public class Main {
    public static void main(String[] args) {
        EncryptionEngingeContext engine = new EncryptionEngingeContext();
        Algorithm1Encryption alg1 = new Algorithm1Encryption();
        engine.setStrategy(alg1);
        engine.getEncryptedText("test");

        Algorithm2Encryption alg2 = new Algorithm2Encryption();
        engine.setStrategy(alg2);
        engine.getEncryptedText("test");

        Algorithm3Encryption alg3 = new Algorithm3Encryption();
        engine.setStrategy(alg3);
        engine.getEncryptedText("test");

    }
}
