import java.util.Scanner;

public class FibonacciSequence {

    private static final Scanner SC = new Scanner(System.in);

    /**
     * Gets the nth number in fibonacci sequence.
     * @param n the nth number.
     */
    private static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n;
        
        System.out.print("Get the nth number in fibonacci sequence. Enter n: ");
        n = SC.nextInt();
        
        System.out.println(String.format("The %dth number is: %d", n, fib(n)));
    }

}
