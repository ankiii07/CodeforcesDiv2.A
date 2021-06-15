package codeForcesDiv2A;

import java.util.Scanner;

public class Expressions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int x = Math.max(a + b + c, a * b * c);
		int y = Math.max((a + b) * c, a * (b + c));
		int z = Math.max(x, y);
	    System.out.println(z);
	}

}
