package map;

import java.util.Scanner;

public class StringMul {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2,result;
		s1=sc.next();
		s2=sc.next();
		int re= Integer.parseInt(s1) * Integer.parseInt(s2);
		
		result=String.valueOf(re);
				System.out.println(result);
	}

}
