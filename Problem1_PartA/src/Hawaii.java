public class Hawaii extends State {
    public Hawaii() {
        this.name = "Hawaii";
        this.salesTaxBehavior = new FourPointFivePercent(); // Use the FourPointFivePercent tax behavior
    }
}