package designpattern.observerpattern.observer;

import designpattern.observerpattern.observable.IPhoneObservableImpl;


public class MobilePhoneAlertObserver implements NotificationAlertObserver{


    @Override
    public void update(IPhoneObservableImpl observable) {
        System.out.println("mobile alert : "+observable.getStock());
    }
}
