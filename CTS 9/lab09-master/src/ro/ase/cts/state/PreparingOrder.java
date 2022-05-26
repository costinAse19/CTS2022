package ro.ase.cts.state;

public class PreparingOrder implements IState{

    private static PreparingOrder instance = null;

    private PreparingOrder(){}

    public static PreparingOrder getInsance(){
        if(instance == null){
            instance = new PreparingOrder();
        }
        return instance;
    }

    @Override
    public void updateState(OrderContext orderContext) {
        System.out.println("Your order is prepared!");
    }
}
