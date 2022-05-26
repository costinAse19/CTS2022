public class FactoryPachetCazazre implements Factory{
    @Override
    public PachetTuristic crearePachet() {

        PachetCazare pachetCazare = new PachetCazare();

        return pachetCazare;
    }
}
