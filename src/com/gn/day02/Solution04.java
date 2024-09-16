package com.gn.day02;

import java.util.Scanner;

public class Solution04 {
	// When a natural number n is given as input, 
	// write a code that outputs "n is even" 
	// if n is even, and "n is odd" if n is odd.
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0) {
        	System.out.println(n+" is even");
        } else {
        	System.out.println(n+" is odd");
        }
    }
}
