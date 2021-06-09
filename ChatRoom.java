package codeForcesDiv2A;

import java.util.Scanner;

public class ChatRoom {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int len = str.length();
	int[] s = {'h','e','l','l','o'};
	str.toLowerCase();
	int i =0;
		for(int j =0;j<len;j++)
		{
			if(s[i]==str.charAt(j))
			{
				i++;
			}
			if(i==5)
				break;
		}
		if(i==5)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	
	
	}

}
