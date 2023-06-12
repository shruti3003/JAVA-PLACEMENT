import java.util.*;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is largest number among all");

        } else if (b > c) {
            System.out.println("b is greater");
        } else {
            System.out.println("c is greater ");
        }

    }

}
