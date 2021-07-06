package mayLong;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XOREquality {

	public static void main(String[] args) {
		try 
		{ 
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        while(t>0)
	        {
	            int count =0;
	            long a=2;
	            long b = Long.parseLong(br.readLine());
	            long M = 1000000007;
	            for(int i = 1; i<mod(2,b,M);i++)
	            {
	            	if(a%M>=0 && ((a%M)<=(mod(2,b,M))))
	            	{
	            		if(((a%M)^(a%M+1)) == (((a%M)+2)^(a%M+3)))
	                    {
	                        count++;
	                    }
	            	}
	            	a++;
	            }
	            
	            System.out.println(count);
	            t--;
	        }
		 }
	        catch(Exception e) 
	        {
		    }
	        
		}

	 public static long mod(long a, long  b,  long M)
	 {
           a %= M;
            long res = 1;
           while (b > 0) {
               if ((b & 1)==1)
                   res = res * a % M;
               a = a * a % M;
               b >>= 1;
           }
           return res;
   }
}
