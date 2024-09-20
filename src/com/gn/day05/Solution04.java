package com.gn.day05;

// Multiplication and sum of elements
public class Solution04 {
	// Given a list of integers, num_list, 
	// complete the solution function to return 1 
	// if the product of all elements is less than the square of the sum of all elements 
	// and 0 if it is greater.

	public int solution(int[] num_list) {
        int sum = 0;
        int multi = 1;
        for(int num : num_list) {
        	multi *= num;
        	sum += num;
        }
        return multi < sum*sum ? 1 : 0;
    }
}
