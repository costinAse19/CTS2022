package ro.ase.cts.state;

public class OrderContext {
    private int noOrder;
    private String name;
    private IState state;

    public OrderContext(int noOrder, String name, IState state) {
        this.noOrder = noOrder;
        this.name = name;
        this.state = state;
    }

    public void setState(IState state) {
        this.state = state;
    }
    public void nextState(){
        state.updateState(this);
    }
}
