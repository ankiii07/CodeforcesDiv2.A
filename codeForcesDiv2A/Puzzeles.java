package codeForcesDiv2A;

import java.util.Arrays;
import java.util.Scanner;

public class Puzzeles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m =sc.nextInt();
		long[] arr = new long[m];
		for (int i = 0; i < m; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); 
		long ans = arr[n - 1] - arr[0];
		for (int i = 0; i + n - 1 < m; i++)
		{
			long d = arr[i + n - 1] - arr[i];
			ans = Math.min(d, ans);
		}
		System.out.println(ans);
	}

}
