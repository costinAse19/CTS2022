package ro.ase.cts.strategy;

public class Algorithm1Encryption implements IEncryptionStrategy{
    @Override
    public void encrypt(String text) {
        System.out.println("First algorithm has been used: alg1#"+text+"#alg1");
    }
}
