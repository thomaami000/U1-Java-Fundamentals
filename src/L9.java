import javax.swing.JOptionPane;

public class L9{

    public static void main(String[] args) {

        String firstName;
        String lastName;

        firstName = JOptionPane.showInputDialog("What's your first name?");
        lastName = JOptionPane.showInputDialog("What's your last name?");


        JOptionPane.showMessageDialog(null, "Hello " + firstName + lastName + "!!");

        //ALL INPUT IS RECEIVED AS A STRING

        //PRO TOP: Variables of the same data-type can be separated with a comma in the decleration

        int mph, minutes;
        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you traveling (in MPH)?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long, in minutes, were you travelling"));

        hours = minutes/60.0;

        distance = mph * hours;

        JOptionPane.showMessageDialog(null, "You travelled " + distance + " miles ");
        System.exit (0);

    }
}
