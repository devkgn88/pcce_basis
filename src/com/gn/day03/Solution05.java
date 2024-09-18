package com.gn.day03;

public class Solution05 {
	// Operation ⊕ is an operation on two integers 
	// and returns the value written by concatenating the two integers. 
	// For example:12 ⊕ 3 = 123
	// 3 ⊕ 12 = 312
	// Given positive integers a and b, 
	// complete the solution function that returns 
	// the larger of a ⊕ b and 2 * a * b.
	public int solution(int a, int b) {
		int sum = Integer.parseInt(a+""+b);
		int multi = 2*a*b;
		System.out.println(sum+":"+multi);
        return sum < multi ? multi : sum;
    }
}
