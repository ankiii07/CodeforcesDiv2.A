package codeForcesDiv2A;

import java.util.Scanner;

public class Games 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[1000];
		int[] arr2 = new int[1000];
		
		for (int i = 1; i <= n; ++i)
		{
			arr1[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
		}
		
		int ans=0;
		
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= n; ++j)
			{
				if (i != j && arr1[i] == arr2[j])
				{
					++ans;
				}
			}
		}
		System.out.println(ans);
	}

}
