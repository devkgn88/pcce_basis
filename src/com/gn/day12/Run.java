package com.gn.day12;

public class Run {
	public static void main(String[] args) {
		Solution01 s1 = new Solution01();
		System.out.println("========== 2,3,4,5,6 ==========");
		s1.solution(3, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		System.out.println("========== 2,4,6 ==========");
		s1.solution(4, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
	}
}
