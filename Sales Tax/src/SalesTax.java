public class SalesTax {

    public static void main(String[] args) {
        //declare and initialize variables
        double price = 9.99;
        int quantity = 6;
        double _tax = 7; //.07
        final double TAX = _tax/100.0;


        //declarations
        double subTotal = price * quantity;
        double taxTotal = subTotal * TAX;
        double totalCost = subTotal + taxTotal;

        System.out.println("you bought " + quantity + " shirts for " + price + " per shirt. ");
        System.out.println("Subtotal: " + subTotal);
        System.out.println("Tax: " + taxTotal);
        System.out.println("Total: " + totalCost);

        //DISCOUNTS AND INCREASES

        //FORMULA: AMOUNT * ( 1 +/- PERCENTAGE) = TOTAL
    }
    /*
    Create a program which takes a quantity, price and tax percentage and outputs the total cost with tax.
     */


}
