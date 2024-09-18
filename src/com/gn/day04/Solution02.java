package com.gn.day04;

public class Solution02 {
	// The integers number, n, and m are given. 
	// Complete the solution function so that it returns 1 
	// if number is a multiple of n and a multiple of m, and 0 otherwise.
	public int solution(int number, int n, int m) {
        return number%n==0 && number%m==0 ? 1 : 0;
    }
	
	public int solution01(int number, int n, int m) {
		int a = n;
		int b = m;
		int temp = 0;
		while(b != 0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		System.out.println(a);
		System.out.println(n*m/a);
		return 0;
	}
}
