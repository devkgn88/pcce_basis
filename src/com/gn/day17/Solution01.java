package com.gn.day17;

public class Solution01 {
	public String solution(String myString, String pat) {
        int last = myString.lastIndexOf(pat);
        last += pat.length();
        return myString.substring(0,last);
    }
}
