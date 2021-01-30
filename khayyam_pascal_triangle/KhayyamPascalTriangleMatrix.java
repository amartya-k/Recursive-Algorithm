import java.util.Scanner;

public class KhayyamPascalTriangleMatrix
{

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("insert number: ");
		Integer input = sc.nextInt();
		printKhayyam(input);
	}

	public static void printKhayyam(Integer i) {
		Integer[][] matrix = new Integer[i + 1][i + 1];	
		matrix[1][1] = 1;
		for (int j = 1; j <= i; j++) {
			for (int k = 1; k <= j; k++) 
				System.out.print(getKhayyam(k, j, matrix) + " ");
			System.out.println();
		}
		
	}

	public static Integer getKhayyam(Integer i, Integer j, Integer[][] matrix) {
		if (i == 1 || j == i)
			matrix[j][i] = 1;
		if (matrix[j][i] == null)
			matrix[j][i] = getKhayyam(i - 1, j - 1, matrix) + getKhayyam(i, j - 1, matrix);
		return matrix[j][i];
	}
}
