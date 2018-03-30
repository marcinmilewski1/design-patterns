package patterns.observer;

import java.util.HashSet;
import java.util.Set;

// publisher
public class Observable {

    private Set<Observer> observers;

    public Observable() {
        this.observers = new HashSet<>();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
