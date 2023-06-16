import java.util.*;

public class Week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("days are not present");
                break;
        }
    }

}
