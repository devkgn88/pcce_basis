package com.gn.day01;

import java.util.Scanner;

public class Solution04 {
	// You are given a string str consisting of the English alphabet. 
	// Write code that converts uppercase letters to lowercase letters 
	// and lowercase letters to uppercase letters for each alphabet.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(char c : a.toCharArray()) {
        	if(c <= 90) {
        		System.out.print(Character.toLowerCase(c));
        	}else {
        		System.out.print(Character.toUpperCase(c));
        	}
        }
    }
}
