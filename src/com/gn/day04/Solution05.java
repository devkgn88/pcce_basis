package com.gn.day04;

// Returning different values ​​depending on flag
public class Solution05 {
	// When two integers a and b and the boolean variable flag are given as parameters, 
	// write a solution function that returns a + b if the flag is true and a - b if it is false.
	public int solution(int a, int b, boolean flag) {
        return flag ? a+b : a-b;
    }
}
