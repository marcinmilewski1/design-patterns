package patterns.observer.publisher;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    public Publisher() {
        this.subscribers = new ArrayList<>();
    }

    private List<Subscriber> subscribers;

    public void subscribe(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void send(String messsage) {
        this.subscribers.forEach(s -> s.receive(messsage));
    }

    public int count() {
        return this.subscribers.size();
    }
}
