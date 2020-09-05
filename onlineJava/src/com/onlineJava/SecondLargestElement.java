package com.onlineJava;

import java.util.Scanner;

public class SecondLargestElement {
	
    static void find2ndLargest(int arr[]) {
    	int maximum1 = arr[0];
    	int maximum2 = arr[0];
    	for(int i=1; i<arr.length; i++) {
    		if(maximum1 < arr[i]) {
    			maximum2 = maximum1;
    			maximum1 = arr[i];
   
    		}
    	}
    	System.out.println(maximum2);
    }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		find2ndLargest(arr);
	}

}
