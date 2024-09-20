package com.gn.day05;

// Handling the code
public class Solution01 {
	public String solution01(String code) {
        String ret = "";
        int mode = 0;
        String[] arr = code.split("");
        for(int i = 0 ; i < arr.length ; i++) {
        	if(mode == 0) {
        		if(arr[i].equals("1") == false) {
        			if(i%2 == 0) ret += arr[i];
        		}else {
        			mode = 1;
        		}
        	} else {
        		if(!arr[i].equals("1")) {
        			if(i%2 != 0) ret += arr[i];
        		} else {
        			mode = 0;
        		}
        	}
        }
        return ret.equals("") ? "EMPTY" : ret;
    }
	
	public String solution(String code) {
		StringBuilder sb = new StringBuilder();
		int mode = 0 ;
		String[] arr = code.split("");
		for(int i = 0 ; i < arr.length ; i++) {
			if("1".equals(arr[i])) {
				mode = mode == 0 ? 1 : 0;
				continue;
			}
			if(i % 2 == mode) sb.append(arr[i]);
		}
		return sb.length() == 0 ? "EMPTY" : sb.toString();
	}
}
