package SeptemberChallange;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AirlineRestrictions {

	public static void main(String[] args) throws java.lang.Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			 try {
		                 String[] Input = br.readLine().split(" ");
		                    
		                 long A = Integer.parseInt(Input[0]);
		                 long B = Integer.parseInt(Input[1]);
		                 long C = Integer.parseInt(Input[2]);
		                 long D = Integer.parseInt(Input[3]);
		                 long E = Integer.parseInt(Input[4]);
		                 
		                 if(A <= B && A <= C)
		             	{
		                	
		             		if(B+C<=D && A<=E)
		             		{
		             			System.out.println("YES");
		             		}
		             		else
		             		{
		             			System.out.println("NO");
		             		}
		             	}
		             	else if(B <= C)
		             	{
		             		if(A+C<=D && B<=E)
		             		{
		             			System.out.println("YES");
		             		}
		             		else
		             		{
		             			System.out.println("NO");
		             		}
		             	}
		             	else
		             	{
		             		if(B+A<=D && C<=E)
		             		{
		             			System.out.println("YES");
		             		}
		             		else
		             		{
		             			System.out.println("NO");
		             		}
		             	}	
			 }
			 catch (IOException ex)
             {
                 throw new RuntimeException(ex);
             }
         t--;
		}
		                 

	}

}
