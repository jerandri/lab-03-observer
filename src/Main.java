public class Main {
    public static void main(String[] args) {
        Order order = new Order("ORD-001");

        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        order.addItem(50.0);
        System.out.println(order);

        order.addItem(80.0);
        System.out.println(order);

        order.addItem(30.0);
        System.out.println(order);

        order.addItem(25.0);
        System.out.println(order);

        order.addItem(40.0);
        System.out.println(order);

        order.addItem(20.0);
        System.out.println(order);
    }
}
