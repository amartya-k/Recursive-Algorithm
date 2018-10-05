import java.util.Scanner;

public class GCD {

    private final static Scanner SC = new Scanner(System.in);

    /**
     * Gets the gcd (greatest common divisor) of integer a and b.
     * @param a first integer.
     * @param b second integer.
     */
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    /**
     * Gets the lcm (least common multiple) of integer a and b.
     * @param a first integer.
     * @param b second integer.
     */
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


    public static void main(String[] args) {
        int a;
        int b;
        
        System.out.println("Get the gcd and lcm for a and b.");
        
        System.out.print("Enter the value of a: ");
        a = SC.nextInt();
        
        System.out.print("Enter the value of b: ");
        b = SC.nextInt();
        
        System.out.println(String.format("The GCD of %d and %d is %d.", a, b, gcd(a, b)));
        System.out.println(String.format("The LCM of %d and %d is %d.", a, b, lcm(a, b)));
    }

}
