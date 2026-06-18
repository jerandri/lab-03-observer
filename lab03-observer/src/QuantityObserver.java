public class QuantityObserver implements OrderObserver {

    private static final int THRESHOLD = 5;
    private static final double FREE_SHIPPING = 0.0;
    private static final double DEFAULT_SHIPPING = 10.0;

    @Override
    public void update(Order order) {
        if (order.getItemCount() > THRESHOLD) {
            order.setShippingCost(FREE_SHIPPING);
            System.out.println("[QuantityObserver] Free shipping applied!");
        } else {
            order.setShippingCost(DEFAULT_SHIPPING);
            System.out.println("[QuantityObserver] Shipping: $" + DEFAULT_SHIPPING);
        }
        order.setTotalPrice(order.getItemCost() + order.getShippingCost());
    }
}
