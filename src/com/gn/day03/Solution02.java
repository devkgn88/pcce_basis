package com.gn.day03;

public class Solution02 {
	// You are given an array arr containing characters.
	// Please write a solution function that returns 
	// a string that concatenates the elements of arr in order.
	public String solution(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
        	sb.append(s);
        }
        return sb.toString();
    }
}
