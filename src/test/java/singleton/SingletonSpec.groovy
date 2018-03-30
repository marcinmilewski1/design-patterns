package singleton

import patterns.singleton.Singleton
import spock.lang.Specification;

class SingletonTest extends Specification {
    def "Should be only one instance"() {
        given:
        Singleton instance1 = Singleton.getInstance()
        Singleton instance2 = Singleton.getInstance()

        expect:
        instance1.is(instance2)
    }
}
