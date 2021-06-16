package codeForcesDiv2A;

import java.util.Scanner;

public class AntonAndLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner("System.in");
		String s = sc.nextLine();
		int len = s.length();
		int[] arr = new int[500];
		 for (int i = 0; i < len ; i++) 
		 {
			 if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') 
				 {
				 	arr[s.charAt(i)]++;
				 }
		 }
		 int ans=0;
		   for(int i='a'; i<='z'; i++)
		   {
		        if (arr[i]>0)
		        	{
		        		ans++;
		        	}
		   }
		    
		System.out.println(ans);
	}

}
