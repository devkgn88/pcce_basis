package com.gn.day03;

public class Solution03 {
	// Given the string my_string and the integer k
	// please write a solution function 
	// that returns a string that repeats my_string k times
	public String solution01(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < k ; i++) {
        	sb.append(my_string);
        }
        return sb.toString();
    }
	
	public String solution02(String my_string, int k) {
        String answer = "";
        for(int i = 0 ; i < k ; i++) {
        	answer+= my_string;
        }
        return answer;
    }
}
