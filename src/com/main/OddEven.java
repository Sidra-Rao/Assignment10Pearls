package com.main;

import java.util.ArrayList;

public class OddEven {
	
	public Integer[] sortList(Integer[] arr){
		
		ArrayList<Integer> listA = new ArrayList<Integer>() ;
		ArrayList<Integer> listB = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++){
		   if(arr[i]/2 * 2 != arr[i]){
			   listA.add(arr[i]);
		   }else{
			   listB.add(arr[i]);
		   }
		}
		
		listA.addAll(listB);		
		arr = listA.toArray(new Integer[listA.size()]);
		
		return arr;
	}
}
