package com.gn.day03;

public class Solution04 {
	public int solution(int a, int b) {
		int x = Integer.parseInt(a+""+b);
		int y = Integer.parseInt(b+""+a);
        return x < y ? y : x;
    }
}
