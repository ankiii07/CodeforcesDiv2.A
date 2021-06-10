package codeForcesDiv2A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyAndStrings {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(ir);
    	String s1 = br.readLine();
    	String s2 = br.readLine();
    	int out = s1.compareToIgnoreCase(s2);
    	if(out<0)
    	{
    		System.out.println("-1");
    	}
    	else if(out>0)
    	{
    		System.out.println("1");
    	}
    	else
    	{
    		System.out.println("0");
    	}
	}

}
