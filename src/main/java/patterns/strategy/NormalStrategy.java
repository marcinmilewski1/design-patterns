package patterns.strategy;

public class NormalStrategy implements BillingStrategy {
    @Override
    public double calculate(double rawPrice) {
        return rawPrice;
    }
}
