package codeForcesDiv2A;

import java.util.Scanner;

public class Beautifulmatrix {

	public static void main(String[] args) {
		
		int m=5,x = 0,y=0;   
		Scanner sc=new Scanner(System.in);          
		
		int array[][] = new int[m][m];     
		for (int i = 0; i < m; i++)   
		{
			for (int j = 0; j < m; j++) 
			{
				array[i][j] = sc.nextInt();
				if(array[i][j]==1)
				{
		            x=i;
		            y=j;
		            break;  
		        }
			}
		}
		 if(x<2 && y<2)
		 {
		     System.out.println(2-x+2-y);
		 }
		 if(x<2 && y>=2)
		 {
		     System.out.println(2-x+y-2);
		 }
		 if(x>=2 && y<2)
		 {
		    System.out.println(x-2+2-y);
		 }
		 if(x>=2 && y>=2)
		 {
		     System.out.println(x-2+y-2);
		 }
	}

}
