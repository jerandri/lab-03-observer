import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;
    private int itemCount;
    private double itemCost;
    private double totalPrice;
    private double shippingCost;
    private List<OrderObserver> observers;

    public Order(String id) {
        this.id = id;
        this.itemCount = 0;
        this.itemCost = 0.0;
        this.shippingCost = 10.0;
        this.totalPrice = 0.0;
        this.observers = new ArrayList<>();
    }

    public void attach(OrderObserver observer) {
        observers.add(observer);
    }

    public void detach(OrderObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.update(this);
        }
    }

    public void addItem(double price) {
        itemCount++;
        itemCost += price;
        totalPrice = itemCost + shippingCost;
        notifyObservers();
    }

    public String getId() {
        return id;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shipping) {
        this.shippingCost = shipping;
    }

    @Override
    public String toString() {
        return String.format(
            "Order[id=%s | items=%d | cost=%.2f | shipping=%.2f | total=%.2f]",
            id, itemCount, itemCost, shippingCost, totalPrice
        );
    }
}
