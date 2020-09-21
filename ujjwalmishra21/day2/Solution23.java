package com.hsbc.day2;

import java.util.HashMap;
import java.util.Map.Entry;

/*
  program to construct an array with 10 elements and to find the number of    
occurrences of each element in the Array

 */

public class Solution23 {

	public static void main(String[] args) {
		
		int sampleArr[] = new int[] { 2, 5, 2, 1, 6, 4, 4, 9, 2, 7};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < sampleArr.length; i++) {
			if(map.containsKey(sampleArr[i])) {
				int count = map.get(sampleArr[i]);
				count++;
				map.put(sampleArr[i], count);
			}else {
				map.put(sampleArr[i], 1);
			}
		}
		
		for(Entry<Integer, Integer> element: map.entrySet()) 
			System.out.println("Occurences of " + element.getKey() +": " + element.getValue());
		
	}

}
