import java.util.Scanner;

public class Factorial {

    private final static Scanner SC = new Scanner(System.in);

    /**
     * Gets the specified n's factorial.
     * @param n
     */
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n;
        
        System.out.print("Getting n's factorial. Enter n: ");
        n = SC.nextInt();
        
        System.out.println(String.format("%d's factorial is: %d", n, factorial(n)));
    }

}
