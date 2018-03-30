package patterns.strategy;

public class HappyHourStrategy implements BillingStrategy {
    @Override
    public double calculate(double rawPrice) {
        return 0.5 * rawPrice;
    }
}
