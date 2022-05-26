package ro.ase.cts.strategy;

public class EncryptionEngingeContext {
    private IEncryptionStrategy strategy;

    public void setStrategy(IEncryptionStrategy strategy) {
        this.strategy = strategy;
    }
    public void getEncryptedText(String text){
        strategy.encrypt(text);
    }
}
