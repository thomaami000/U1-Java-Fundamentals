public class TimeCrunch {
    public static void main(String[] args) {

        int numOfSeconds = 18465;
        int hours = numOfSeconds / 3600;
        int minutes = (numOfSeconds % 3600)/60;
        int seconds = (numOfSeconds - (3600*hours) - (60*minutes));

        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds ");

    }
    /*
    Create a program which takes a number in seconds and breaks it down into hours, minutes and seconds.

    Example:
     */
}
