package codeForcesDiv2A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayToLongWords {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(ir);
    
    	int num = Integer.parseInt(br.readLine());


    	while(num>0)
    	{
    		String s = br.readLine();
    		int len = s.length();
    		if(len<=10)
    		{
    			System.out.println(s);
    		}
    		else
    		{
    			int c= len-2;
    			System.out.print(s.charAt(0)+""+c+""+s.charAt(len-1));
    			
    		}
    	num--;
    	}
	}

}
