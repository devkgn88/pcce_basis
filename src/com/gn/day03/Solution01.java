package com.gn.day03;

public class Solution01 {
	// You are given two strings str1 and str2 of the same length.
	// Complete the solution function that returns 
	// by creating a string in which each character of the two strings 
	// appears once, alternating from the beginning.
	public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0 ; i < str1.length() ; i++) {
        	answer += str1.charAt(i)+""+str2.charAt(i);
        }
        System.out.println(answer);
        return answer;
    }
}
