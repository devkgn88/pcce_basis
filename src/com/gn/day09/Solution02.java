package com.gn.day09;

public class Solution02 {
	public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < my_strings.length ; i++) {
        	String str = my_strings[i];
        	int from = parts[i][0];
        	int to = parts[i][1];
        	sb.append(str.substring(from, to+1));
        }
        return sb.toString();
    }
}
