package observerpattern.observable;

import observerpattern.observer.NotificationAlertObserver;
/*
    Currently this project
*/
public interface StockObservable {
    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifySubscribers();
    public int getStockCount();
    public void setStockCount(int newStockAdded);

}
