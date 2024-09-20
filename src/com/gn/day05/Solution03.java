package com.gn.day05;

// dice game 2
public class Solution03 {
	// There are three dice numbered 1 to 6.
	public int solution(int a, int b, int c) {
        int answer = a+b+c;
        int type = 0;
        if(a == b) type++;
        if(a == c) type++;
        if(b == c) type++;
        
        if(type != 0) answer *= (a*a + b*b + c*c);
        if(type == 3) answer *= (a*a*a + b*b*b + c*c*c);
        return answer;
		
//		double x = 1 *(Math.pow(a, 1)+Math.pow(b, 1)+Math.pow(c, 1));
//		double y = (x)*(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
//		double z = (y)*(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
    }
}
