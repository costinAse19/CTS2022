package ro.ase.cts.state;

public class Main {
    public static void main(String[] args) {
        OrderContext order = new OrderContext(1,"Guesadilla",PlacedOrder.getInsance());
        order.nextState();
        order.nextState();
        order.nextState();
    }
}
