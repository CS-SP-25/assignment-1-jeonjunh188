public class SalesTaxCalculator {
    public static void main(String[] args) {
        // Ensure the program is run with exactly two command-line arguments
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <saleAmount>");
            return;
        }

        String stateName = args[0];
        double saleAmount;
        saleAmount = Double.parseDouble(args[1]) ; // Convert sale amount from String to double


        State state;

        // Select the appropriate State object based on the state name
        switch (stateName) {
            case "Indiana":
                state = new Indiana();
                state.setSalesTaxBehavior(new SevenPercent()); // Set behavior dynamically
                break;
            case "Alaska":
                state = new Alaska();
                state.setSalesTaxBehavior(new NoTax()); // Set behavior dynamically
                break;
            case "Hawaii":
                state = new Hawaii();
                state.setSalesTaxBehavior(new FourPointFivePercent()); // Set behavior dynamically
                break;
            default:
                System.out.println("Invalid state. Only 'Indiana', 'Alaska', or 'Hawaii' are allowed.");
                return;
        }


        // Display the calculated tax for the specified sale amount
        state.showTax(saleAmount);
    }
}
