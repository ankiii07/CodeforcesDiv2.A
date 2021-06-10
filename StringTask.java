package codeForcesDiv2A;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringTask {

	public static void main(String[] args) throws IOException 
	{
		
		InputStreamReader ir = new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(ir);
    	String s = br.readLine();
    	s = s.toLowerCase();
    	char c;
		int len = s.length();
		for (int i = 0; i < len; i++)
		{
		   c = s.charAt(i);
		
		    if(c == 'a'|| c == 'e'|| c == 'i' || c == 'o' || c == 'u' || c == 'y')
		   {
			 continue;
			}
		  else
		  {
		     System.out.print("."+c); 
		  }
		   }
		}
	}

