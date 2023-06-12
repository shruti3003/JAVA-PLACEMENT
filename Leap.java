public class Leap {
    public static void main(String[] args) {
        int year = 1999;
        if (year % 4 == 0) {
        } else if (year % 400 == 0) {

        }
        if (year % 100 == 0) {
            System.out.println("it is leap year");
        } else {
            System.out.println("It is not Leap Year");
        }
    }
}
