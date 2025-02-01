public class SevenPercent implements SalesTaxBehavior {
    @Override
    public double compute(double value) {
        return value * 0.07; // Compute 7% of the value as tax
    }
}