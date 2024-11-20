package com.gn.day13;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		System.out.println("===== 6 =====");
//		s1.solution(new int[] {2,1,6}, 3);
//		System.out.println("===== 2,1,7,5 =====");
//		s1.solution(new int[] {5,2,1,7,5}, 2);
		
		Solution02 s2 = new Solution02();
		System.out.println("===== 1,6,2 =====");
		s2.solution(new int[] {2,1,6}, 1);
		// 2랑 1,6으로 나누고
		// 1,6을 2앞으로 이동
		System.out.println("===== 7, 5, 5, 2, 1 =====");
		s2.solution(new int[] {5, 2, 1, 7, 5}, 3);
		// 5,2,1이랑 7,5를 나누고
		// 7,5를 5,2,1앞으로 이동
		
		
	}
}
