package ro.ase.cts.strategy;

public class Algorithm3Encryption implements IEncryptionStrategy{
    @Override
    public void encrypt(String text) {
        System.out.println("Third algorithm has been used: alg3#"+text+"#alg3");
    }
}
