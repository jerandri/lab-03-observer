public class QuantityObserver implements OrderObserver {

    private static final int THRESHOLD = 5;
    private static final double FREE_SHIPPING = 0.0;
    private static final double DEFAULT_SHIPPING = 10.0;

    @Override
    public void update(Order order);
}
