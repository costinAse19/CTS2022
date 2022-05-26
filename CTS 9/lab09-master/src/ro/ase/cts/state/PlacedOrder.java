package ro.ase.cts.state;

public class PlacedOrder implements IState{

    private static PlacedOrder instance = null;

    private PlacedOrder(){}

    public static PlacedOrder getInsance(){
        if(instance == null){
            instance = new PlacedOrder();
        }
        return instance;
    }

    private void sendMessage(){
        System.out.println("Your order has been placed.");
    }
    private void changeContext(OrderContext orderContext){
        orderContext.setState(PreparingOrder.getInsance());
    }
    @Override
    public void updateState(OrderContext orderContext) {
        sendMessage();
        changeContext(orderContext);
    }
}
