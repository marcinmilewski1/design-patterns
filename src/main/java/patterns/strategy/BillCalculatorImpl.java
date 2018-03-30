package patterns.strategy;

public class BillCalculatorImpl implements BillCalculator {
    @Override
    public double calculate(BillingStrategy billingStrategy, double rawPrice) {
        return billingStrategy.calculate(rawPrice);
    }
}
