package codeForcesDiv2A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HelpfulMaths {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        
        String s = br.readLine();
        int len = s.length();
        ArrayList<Integer> v = new ArrayList<Integer>();
        for(int i = 0; i < len ; i=i+2)
        {
        	v.add(s.charAt(i)-'0');
        }
        int st[] = new int[v.size()];
        Arrays.sort(st);
        
        for(int i=0;i<len;i++)
        {
            System.out.print(st[i]);
            if(i == len-2)
            	break;
            else
            	{
            	 System.out.print("+");
            	}
        }
	}

}

