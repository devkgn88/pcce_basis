package com.gn.day05;
// concatenated number
public class Solution05 {
	// You are given a list of integers, num_list. 
	// Complete the solution function so that it returns the sum of the odd numbers in num_list 
	// concatenated in order and the even numbers concatenated in order.
	public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0 ; i < num_list.length ; i++){
            if(num_list[i] %2 == 1) odd += num_list[i];
            else even += num_list[i];
        }
        answer = Integer.parseInt(odd)+Integer.parseInt(even);
        return answer;
    }
}
