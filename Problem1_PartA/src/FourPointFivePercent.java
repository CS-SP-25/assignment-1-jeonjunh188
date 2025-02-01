public class FourPointFivePercent implements SalesTaxBehavior{
    @Override
    public double compute(double value){
        return value * 0.045; // Compute 4.5% of the value as tax
    }
}
