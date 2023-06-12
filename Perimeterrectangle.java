import java.util.*;

public class Perimeterrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length");
        // System.out.println("enter the breadth");
        int length = sc.nextInt();
        System.out.println("enter the breadth");
        int breadth = sc.nextInt();
        int perimeter = 2 * (length * breadth);
        System.out.println("perimeter of rectangle " + perimeter);
    }

}
