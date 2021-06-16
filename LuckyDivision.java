package codeForcesDiv2A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LuckyDivision {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
				InputStreamReader ir = new InputStreamReader(System.in);
		    	BufferedReader br=new BufferedReader(ir);
		       
		    	    int n = Integer.parseInt(br.readLine());
		    	    
		    	    if(n%4==0 || n%7==0|| n % 47 ==0|| n% 74 == 0 || n % 477==0)
		    	    {
		    	    	System.out.println("YES");
		            }
		            else 
		            {
		                 System.out.println("NO");
		            }
		        
		}
		 
}