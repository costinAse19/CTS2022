public class FactoryPachetComplet implements Factory{


    @Override
    public PachetTuristic crearePachet() {
        PachetComplet pachetComplet = new PachetComplet();

        return pachetComplet;

    }
}
