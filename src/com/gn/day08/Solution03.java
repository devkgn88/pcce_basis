package com.gn.day08;

public class Solution03 {
	public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int idx : index_list) {
        	sb.append(my_string.charAt(idx));
        }
        return sb.toString();
    }
}
