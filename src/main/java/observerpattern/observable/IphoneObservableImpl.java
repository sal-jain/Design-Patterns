package observerpattern.observable;

import observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{
    public List<NotificationAlertObserver> observerList = new ArrayList<>();
    public int stockCount = 0;

    /**
     * This method will add the observers in the observerlist whow Subscribed to be notified.
     * OPERATION: add
     * @param observer
     */
    @Override
    public void add(NotificationAlertObserver observer){
        observerList.add(observer);
    }

    /**
     * This method will remove the observer from the list observerlist who unSubscribed.
     * OPERATION: remove
     * @param observer
     */
    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    /**
     * OPERATION: notifySubscribers
     * This method will notify the Subscribers.
     */
    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if(stockCount == 0 && newStockAdded > 0){
            notifySubscribers();
            stockCount = newStockAdded;
        }else {
            stockCount = stockCount + newStockAdded;
        }
    }
}
