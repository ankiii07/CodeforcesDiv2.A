package juneChallange;

import java.util.*;
import java.lang.*;
import java.io.*;

public class BellaCaio {

	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t>0)
		{
			 try {
		                 String[] Input = br.readLine().split(" ");
		                    
		                 long D = Integer.parseInt(Input[0]);
		                 long d = Integer.parseInt(Input[1]);
		                 long P = Integer.parseInt(Input[2]);
		                  long Q = Integer.parseInt(Input[3]);
		                 
		                    long count =0;
		                    long x = D/d;
		                    if(x%2==0)
		                    {
		                        count = d*((x/2)*(2*P+(x-1)*Q));
		                    }
		                    else
		                    {
		                        count = d*(x*(P+((x-1)/2)*Q));
		                    }
		                    
		                    count += (D%d)*(P+(x)*Q);
		                    System.out.println(count);
		                    
				        }
		                catch (IOException ex)
		                {
		                    throw new RuntimeException(ex);
		                }
		            t--;
				}
			}
	}


