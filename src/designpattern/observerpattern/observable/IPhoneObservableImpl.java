package designpattern.observerpattern.observable;

import designpattern.observerpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StockObservable{
    List<NotificationAlertObserver> notificationAlertObservers=new ArrayList<>();
    private  int stock;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver notificationAlertObserver:notificationAlertObservers)
            notificationAlertObserver.update(this);
    }


    public void setStock(int stock)
    {
        this.stock+=stock;
         notifySubscribers();

    }

    public int getStock()
    {
        return this.stock;
    }
}
