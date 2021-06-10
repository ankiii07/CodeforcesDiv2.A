package codeForcesDiv2A;

import java.util.*;
import java.lang.*;
import java.io.*;

public class GameWithSticks {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
             String[] Input = br.readLine().split(" ");
                    
              int n = Integer.parseInt(Input[0]);
              int m = Integer.parseInt(Input[1]);
              
              int count = Math.min(m,n);
              if(count%2==0)
              {
            	  System.out.println("Malvika");
              }
              else
              {
            	  System.out.println("Akshat");
              }
              
	}

}
