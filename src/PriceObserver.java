public class PriceObserver implements OrderObserver {

    private static final double THRESHOLD = 200.0;
    private static final double DISCOUNT = 20.0;

    @Override
    public void update(Order order);
}
