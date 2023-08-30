package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName , StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName,"Product is in the stock Hurry Up!!");
    }

    public void sendMsgOnMobile(String userName, String msg){
        System.out.println("Msg sent to"+userName);
    }
}
