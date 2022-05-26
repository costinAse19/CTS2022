public class FactoryPachetTransport implements Factory{

    @Override
    public PachetTuristic crearePachet() {

        PachetTransport pachetTransport = new PachetTransport();

        return pachetTransport;
    }
}
