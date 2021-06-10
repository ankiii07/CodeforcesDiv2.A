package codeForcesDiv2A;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ArrivaloftheGeneral {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());

        List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        int i=0,j=0;
        int count1 =0, count2 =0;
        
        for(i=0;i<n;i++)
        {
        	if(arr.get(i)==max)
        	{
        		count1 = i;
        		break;
        	}
        }
        for(j =n-1;j>=0;j--)
        {
        	if(arr.get(j)==min)
        	{
        		count2 = j;
        		break;
        	}
        }
        int result=0;
        
        if(count1<count2)
        {
	        result= count1 + (n-count2) -1;
	        System.out.println(result);
        }
        else
        {
        	result= count1 + (n-count2) -2;
	        System.out.println(result);
        }
	        
        
	}

}
