package designpattern.observerpattern;

import designpattern.observerpattern.observable.IPhoneObservableImpl;
import designpattern.observerpattern.observable.StockObservable;
import designpattern.observerpattern.observer.EmailAlertObserver;
import designpattern.observerpattern.observer.MobilePhoneAlertObserver;
import designpattern.observerpattern.observer.NotificationAlertObserver;

public class Client {
    public static void main(String[] arg)
    {
        NotificationAlertObserver observer1=new EmailAlertObserver();
        NotificationAlertObserver observer2=new EmailAlertObserver();
        NotificationAlertObserver observer3=new MobilePhoneAlertObserver();
        NotificationAlertObserver observer4=new MobilePhoneAlertObserver();
        IPhoneObservableImpl observable=new IPhoneObservableImpl();
        observable.add(observer2);
        observable.add(observer3);
        observable.add(observer1);
        observable.add(observer4);
        observable.setStock(10);
        observable.setStock(0);
        observable.setStock(100);



    }
}
