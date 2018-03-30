import patterns.strategy.BillCalculator
import patterns.strategy.BillCalculatorImpl
import patterns.strategy.HappyHourStrategy
import patterns.strategy.NormalStrategy
import spock.lang.Specification

class StrategySpec extends Specification {

    def "Should calculate based on strategy"() {
        given:
        BillCalculator billCalculator = new BillCalculatorImpl()

        when:
        double calculate = billCalculator.calculate(new NormalStrategy(), 500.0)

        then:
        calculate.compareTo(500.0) == 0

        when:
        calculate = billCalculator.calculate(new HappyHourStrategy(), 500.0)

        then:
        calculate.compareTo(250.0) == 0


    }
}