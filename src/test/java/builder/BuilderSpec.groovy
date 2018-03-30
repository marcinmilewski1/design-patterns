package builder

import patterns.builder.BuildingObject
import spock.lang.Specification

class BuilderSpec extends Specification {
    def "Should build object with builder"() {
        when:
        def obj = new BuildingObject.Builder().setValue1(1).setValue2(2).setValue3("3").build()

        then:
        with(obj) {
            getValue1() == 1
            getValue2() == 2
            getValue3() == "3"
        }
    }
}