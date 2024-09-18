package com.gn.day04;

public class Solution01 {
	// When the integers num and n are given as parameters, 
	// complete the solution function to return 1 
	// if num is a multiple of n and 0 if it is not a multiple of n.
	public int solution(int num, int n) {
        int answer = 0;
        if(num%n == 0)answer =1;
        return answer;
    }
}
