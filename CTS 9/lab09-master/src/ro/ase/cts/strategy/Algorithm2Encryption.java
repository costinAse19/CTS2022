package ro.ase.cts.strategy;


public class Algorithm2Encryption implements IEncryptionStrategy{
    @Override
    public void encrypt(String text) {
        System.out.println("Second algorithm has been used: alg2#"+text+"#alg2");
    }
}