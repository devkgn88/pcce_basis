package com.gn.day05;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		s1.solution("abc1abc1abc");
		
		Solution02 s2 = new Solution02();
		System.out.println("=== 1 ===");
		s2.solution(3, 4, new boolean[] {true, false, false, true, true});
		System.out.println("=== 2 ===");
		s2.solution(7, 1, new boolean[] {false, false, false, true, false, false, false});
	}
}
