package com.gn.day13;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		System.out.println("===== 6 =====");
//		s1.solution(new int[] {2,1,6}, 3);
//		System.out.println("===== 2,1,7,5 =====");
//		s1.solution(new int[] {5,2,1,7,5}, 2);
		
//		Solution02 s2 = new Solution02();
//		System.out.println("===== 1,6,2 =====");
//		s2.solution(new int[] {2,1,6}, 1);
		// 2랑 1,6으로 나누고
		// 1,6을 2앞으로 이동
//		System.out.println("===== 7, 5, 5, 2, 1 =====");
//		s2.solution(new int[] {5, 2, 1, 7, 5}, 3);
		// 5,2,1이랑 7,5를 나누고
		// 7,5를 5,2,1앞으로 이동
		
//		Solution03 s3 = new Solution03();
//		System.out.println("===== u,u =====");
//		s3.solution(new String[] {"u", "u", "l", "r"});
//		System.out.println("===== =====");
//		s3.solution(new String[] {"l"});
//		System.out.println("===== u,l =====");
//		s3.solution(new String[] {"u","r","u","l"});
		
//		Solution04 s4 = new Solution04();
//		System.out.println("===== 2 =====");
//		s4.solution(new int[] {2,1,6}, 1);
//		System.out.println("===== 5,2,1 =====");
//		s4.solution(new int[] {5,2,1,7,5}, 3);
		
		Solution05 s5 = new Solution05();
		System.out.println("===== 4,6,7 =====");
		s5.solution(new int[] {4, 2, 6, 1, 7, 6}, 2);
		System.out.println("===== 4,7 =====");
		s5.solution(new int[] {4, 2, 6, 1, 7, 6}, 4);
		
		
	}
}
