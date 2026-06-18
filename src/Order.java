import java.util.List;

public class Order {

    private String id;
    private int itemCount;
    private double itemCost;
    private double totalPrice;
    private double shippingCost;
    private List<OrderObserver> observers;

    public Order(String id);

    public void attach(OrderObserver observer);

    public void detach(OrderObserver observer);

    private void notifyObservers();

    public void addItem(double price);

    public String getId();
    public int getItemCount();
    public double getItemCost();
    public double getTotalPrice();
    public double getShippingCost();
    public void setTotalPrice(double totalPrice);
    public void setShippingCost(double shipping);

    @Override
    public String toString();
}
