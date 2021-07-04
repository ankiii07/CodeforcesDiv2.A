package codeForcesDiv2A;

import java.util.Scanner;

public class YoungPhysicist {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=0,t=0,r=0;
		for(int i =0;i<n;i++)
		{
			int x = sc.nextInt();
			int y =  sc.nextInt();
			int z = sc.nextInt();
			s = s + x;
			t = t + y;
			r = r + z;
		}
		
		if(s==0 && t==0 && r==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
