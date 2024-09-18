package com.gn.day04;

public class Solution03 {
	// When a positive integer n is given as a parameter,
	// if n is odd, the solution returns the sum of all odd positive integers less than or equal to n,
	// and if n is even, it returns the sum of the squares of all positive integers less than or equal to n. 
	// Please write a function.
	public int solution(int n) {
        int answer = 0;
        if(n % 2 != 0) {
        	for(int i = 1 ; i <= n ; i+=2) {
        		answer += i;
        	}
        } else {
        	for(int i = 2 ; i <= n ; i+=2) {
        		answer += i*i;
        	}
        	// 2 4 6 8 10
        }
        return answer;
    }
}
