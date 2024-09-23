package designpattern.observerpattern.observer;

import designpattern.observerpattern.observable.IPhoneObservableImpl;

public class EmailAlertObserver implements  NotificationAlertObserver{
    @Override
    public void update(IPhoneObservableImpl observable) {
        System.out.println("emailAlert :"+observable.getStock());
    }
}
