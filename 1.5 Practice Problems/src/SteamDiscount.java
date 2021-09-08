public class SteamDiscount {
    public static void main(String[] args) {

        double initialCost = 60.00;
        double percentOff = 0.20;
        double sale = (initialCost * percentOff) / 100;
        double total = initialCost - sale;

        System.out.println("The 20% sale makes the price: $" + total);
    }
    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */
}
