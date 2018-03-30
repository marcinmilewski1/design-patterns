import patterns.observer.publisher.Publisher
import patterns.observer.publisher.Subscriber
import spock.lang.Specification

class PublisherSpec extends Specification {
    Publisher publisher = new Publisher()
    Subscriber subscriber1 = Mock()
    Subscriber subscriber2 = Mock()

    def "should add subscrier"() {
        when:
        publisher.subscribe(subscriber1)

        then:
        publisher.count() == 1
    }

    def "should send messages to all subscribers"() {
        given:
        publisher.subscribe(subscriber1)
        publisher.subscribe(subscriber2)

        when:
        publisher.send("hello")

        then:
        1 * subscriber1.receive("hello")
        1 * subscriber2.receive("hello")

    }
}