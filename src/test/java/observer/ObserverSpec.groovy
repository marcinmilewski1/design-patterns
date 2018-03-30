import patterns.observer.Observable
import patterns.observer.Observer
import spock.lang.Specification

class ObserverSpec extends Specification {
    Observable observable = new Observable()
    Observer observer1 = Mock()
    Observer observer2 = Mock()

    def setup() {
        observable.add(observer1)
        observable.add(observer2)
    }

    def "Observer should react when observables fire event"() {
        when:
        observable.notifyObserver()

        then:
        1 * observer1.update()
        1 * observer2.update()
    }
}