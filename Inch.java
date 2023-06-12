import java.util.*;

public class Inch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meter = sc.nextInt();
        double inch, feet;
        inch = meter * 39.37;
        feet = meter * 3.281;
        System.out.println(inch);
        System.out.println(feet);

    }

}
