package designpattern.observerpattern.observer;

import designpattern.observerpattern.observable.IPhoneObservableImpl;

public interface NotificationAlertObserver {
    public void update(IPhoneObservableImpl obj);
}
