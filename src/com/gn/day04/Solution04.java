package com.gn.day04;

// Condition String
public class Solution04 {
	// Depending on the string, I want to compare the size of two numbers like this:
	// If the two numbers are n and m
	// ">", "=" : n >= m
	// "<", "=" : n <= m
	// ">", "!" : n > m
	// "<", "!" : n < m
	// You are given two strings ineq and eq. 
	// ineq is one of "<" and ">", and eq is one of "=" and "!".
	// And when two integers n and m are given, 
	// complete the solution function to return 1 if n and m meet the conditions of ineq and eq, 
	// and 0 otherwise.
	public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        System.out.println(ineq+" : "+eq+" : "+n+" : "+m);
        if(ineq.equals(">")) {
        	if(eq.equals("=")) {
        		if(n >= m) answer = 1;
        	} else {
        		if(n > m) answer = 1;
        	}
        } else {
        	if(eq.equals("=")) {
        		if(n <= m) answer = 1;
        	} else {
        		if(n < m) answer = 1;
        	}
        }
        return answer;
    }
}
