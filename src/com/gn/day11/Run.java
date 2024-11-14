package com.gn.day11;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		s1.solution("Programmers");
		
//		Solution02 s2 = new Solution02();
//		System.out.println("========== [3,6,9] ==========");
//		s2.solution(10, 3);
//		System.out.println("========== [5,10,15] ==========");
//		s2.solution(15, 5);
		
//		Solution03 s3 = new Solution03();
//		System.out.println("========== programmers ==========");
//		s3.solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3});

//		Solution04 s4 = new Solution04();
//		s4.solution(10, 3);
		
		Solution05 s5 = new Solution05();
		System.out.println("========== 3 ==========");
		s5.solution(new int[] {0,0,0,1}, 1);	
		System.out.println("========== -1 ==========");
		s5.solution(new int[] {1,0,0,1,0,0}, 4);
		System.out.println("========== 3 ==========");
		s5.solution(new int[] {1,1,1,1,0}, 3);
	}
}
