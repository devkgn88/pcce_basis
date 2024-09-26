package com.gn.day09;

public class Run {

	public static void main(String[] args) {
//		Solution01 s1 = new Solution01();
//		s1.solution(new String[] {"0123456789","9876543210","9999999999999"}, 50000, 5, 5);
		
//		Solution02 s2 = new Solution02();
//		s2.solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"}, 
//				new int[][] {{0,4},{1,2},{3,5},{7,7}});
		
		Solution03 s3 = new Solution03();
		System.out.println("=== 1 ===");
		s3.solution("ProgrammerS123", 11);
		System.out.println("=== 2 ===");
		s3.solution("He110W0r1d", 5);
	}

}
