package com.gn.day05;

public class Solution02 {
	// You are given two integers a and d and a boolean array of length n included. 
	// When included[i] means i + 1 term in an arithmetic sequence 
	// where the first term is a and the common difference is d, 
	// write a solution function that returns the value of only the terms 
	// for which included is true from the 1st to the nth terms of this arithmetic sequence
	public int solution01(int a, int d, boolean[] included) {
        int answer = 0;
        // 3, 7, 11, 15, 19 -> 3 + 4 * (5-1)
        // 7, 8, 9, 10, 11, 12, 13, 14 -> 7 + 1 * 7 
        int idx = 0 ; 
        for(int i = a ; i <= a + (d * (included.length-1)) ; i+= d ) {
        	if(included[idx]) answer += i ;
        	idx++;
        } 
        return answer;
    }
	public int solution(int a, int d, boolean[] included) {
		int answer = 0 ;
		for(int i = 0 ; i < included.length ; i++) {
			if(included[i])  answer += a+(d*i);
		}
		return answer;
	}
}
