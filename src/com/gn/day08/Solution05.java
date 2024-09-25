package com.gn.day08;

public class Solution05 {
	public String solution(String my_string, int[][] queries) {
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < queries.length; i++) {
        	System.out.println(queries[i][0]+" : "+queries[i][1]);
        	for(int a = 0 ; a < queries[i][0] ; a++) {
        		sb.append(my_string.charAt(a));
        	}
        	for(int b = queries[i][1] ; b >= queries[i][0] ; b--) {
        		sb.append(my_string.charAt(b));
        	}
        	if(queries[i][0]+1 < my_string.length()) {
        		for(int c = queries[i][0]+1 ; c < my_string.length() ; c++) {
        			sb.append(my_string.charAt(c));
        		}		
        	}
        	my_string = sb.toString();
        	sb = null;
        }
        return sb.toString();
    }
}
