package SeptemberChallange;

import java.util.*;

public class result {
	
	public static int countPairs(List<Integer> nums, int k) {
	    Set<String> uniquePairs = new HashSet<>();
	    int[] arr = nums.stream().mapToInt(i -> i).sorted().distinct().toArray();

	    for (int i = 0; i < arr.length; i++)
	        for (int j = i + 1; j < arr.length; j++)
	            if ((k >= 0 ? arr[j] - arr[i] : arr[i] - arr[j]) == k)
	                uniquePairs.add(arr[i] + ":" + arr[j]);

	    return uniquePairs.size();
	}

	public static void main(String[] args) throws Exception {
	        List<Integer> l1 = Arrays.asList(8, 12, 16, 4, 0, 20);
	        int k = 4;
	        System.out.println(l1);
	        System.out.println(countPairs(l1, k));
	    }
	}

