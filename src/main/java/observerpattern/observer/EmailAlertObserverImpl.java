package observerpattern.observer;

import observerpattern.observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{
    String emailId;
    StockObservable observable;
    public EmailAlertObserverImpl(String emailId, StockObservable observable){
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock Hurry Up!!");
    }

    public void sendMail(String emailId , String msg){
        System.out.println("Mail set to: "+emailId);
    }
}
