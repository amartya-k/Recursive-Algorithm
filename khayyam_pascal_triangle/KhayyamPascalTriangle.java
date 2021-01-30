import java.util.Scanner;

public class KhayyamPascalTriangle
{

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert number: ");
		Integer input = sc.nextInt();
		printKhayyam(input);
	}

	private static void printKhayyam(Integer i) {
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) 
				System.out.print(getKhayyam(k, j) + " ");
			System.out.println();
		}
	}

	private static Integer getKhayyam(Integer i, Integer j) {
		return (i == 1 || i == j) ? 1 : getKhayyam(i - 1, j - 1) + getKhayyam(i, j - 1);
	}
}
