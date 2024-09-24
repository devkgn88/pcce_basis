package com.gn.day08;

public class Solution01 {
	
	public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = (x1||x2)&&(x3||x4);
        return answer;
    }
	
	public boolean solution01(boolean x1, boolean x2, boolean x3, boolean x4) {
        return n_method(u_method(x1,x2),u_method(x3,x4));
    }
	public boolean u_method(boolean b1, boolean b2) {
		boolean result = true;
		if(b1 == false && b2 == false) result = false;
		return result;
	}
	public boolean n_method(boolean b1, boolean b2) {
		boolean result = false;
		if(b1 == true && b2 == true) result = true;
		return result;
	}
	
	
}
