public class PriceObserver implements OrderObserver {

    private static final double THRESHOLD = 200.0;
    private static final double DISCOUNT = 20.0;

    @Override
    public void update(Order order) {
        if (order.getItemCost() > THRESHOLD) {
            double discounted = order.getTotalPrice() - DISCOUNT;
            order.setTotalPrice(discounted);
            System.out.println("[PriceObserver] Discount applied: -$" + DISCOUNT
                + " -> new total: $" + order.getTotalPrice());
        }
    }
}
