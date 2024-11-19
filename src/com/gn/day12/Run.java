package com.gn.day12;

public class Run {
	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		System.out.println("========== 2,3,4,5,6 ==========");
//		s1.solution(3, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
//		System.out.println("========== 2,4,6 ==========");
//		s1.solution(4, new int[] {1,5,2}, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
		
//		Solution02 s2 = new Solution02();
//		System.out.println("========= 5 ==========");
//		s2.solution(new int[] {12, 4, 15, 46, 38, -2, 15});
//		System.out.println("========== -1 ==========");
//		s2.solution(new int[] {13, 22, 53, 24, 15, 6});
		
//		Solution03 s3 = new Solution03();
//		System.out.println("========== [2, 3, 4, 1, 2, 3, 4, 5] ==========");
//		s3.solution(new int[] {1, 2, 3, 4, 5},new int[][] {{1,3},{0,4}});
		
//		Solution04 s4 = new Solution04();
//		System.out.println("===== 2, 1, 4, 5, 2 =====");
//		s4.solution(new int[] {1, 2, 1, 4, 5, 2, 9});
//		System.out.println("===== 2 =====");
//		s4.solution(new int[] {1, 2, 1});
//		System.out.println("===== -1 =====");
//		s4.solution(new int[] {1,1,1});
//		System.out.println("===== 2, 1, 2, 1, 10, 2 ======");
//		s4.solution(new int[] {1, 2, 1, 2, 1, 10, 2, 1});
		
		Solution05 s5 = new Solution05();
		System.out.println("===== 1,2,3 =====");
		s5.solution(new int[] {0,1,2,3,4,5}, new int[] {4,1,2});
		// 4
		// 짝수 인덱스
		// 4번 인덱스 뒷부분 자르기 -> 0,1,2,3,4
		// 1
		// 홀수 인덱스
		// 1번 인덱스 앞부분 -> 1,2,3,4
		// 2
		// 짝수 인덱스
		// 2번 인덱스 뒷부분 -> 1,2,3
	}
}
