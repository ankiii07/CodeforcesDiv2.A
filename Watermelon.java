package codeForcesDiv2A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Watermelon {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
				InputStreamReader ir = new InputStreamReader(System.in);
	        	BufferedReader br=new BufferedReader(ir);
	        
	        	int number = Integer.parseInt(br.readLine());
	        	
		        	if(number%2==0 && number!=2)
		        	{
		        		System.out.println("YES");
		        	}
		        	else
		        	{
		        		System.out.println("NO");
		        	}
	        	
			}
	}

