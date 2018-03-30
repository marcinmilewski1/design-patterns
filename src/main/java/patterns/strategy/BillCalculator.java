package patterns.strategy;

public interface BillCalculator {
    double calculate(BillingStrategy billingStrategy, double rawPrice);
}
