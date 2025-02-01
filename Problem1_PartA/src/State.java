public abstract class State {
    protected String name;
    protected SalesTaxBehavior salesTaxBehavior;

    // Getter for the state's name
    public String getName() {
        return name;
    }

    // Setter for the state's name
    public void setName(String name) {
        this.name = name;
    }

    // Setter for the sales tax behavior
    public void setSalesTaxBehavior(SalesTaxBehavior salesTaxBehavior) {
        this.salesTaxBehavior = salesTaxBehavior;
    }

    // Calculate and display the sales tax for a given value
    public void showTax(double value) {
        double tax = salesTaxBehavior.compute(value);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", value, name, tax);
    }
}