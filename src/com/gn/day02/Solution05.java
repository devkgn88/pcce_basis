package com.gn.day02;

public class Solution05 {
	// The strings my_string, 
	// overwrite_string and the integer 
	// are said to be the same.
	// Please write a solution function 
	// that returns a string 
	// that changes the length of 
	// overwrite_string from index s of the string my_string 
	// to the string overwrite_string.
	public static void main(String[] args) {
		solution("He11oWor1d","lloWorl",2);
		solution("Program29b8UYP","merS123",7);
	}
	public static String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s+overwrite_string.length());
        return answer;
    }
}
