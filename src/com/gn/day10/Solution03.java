package com.gn.day10;

public class Solution03 {
	// 문자열 my_string과 정수 s, e가 매개변수로 주어질 때, 
	// my_string에서 인덱스 s부터 인덱스 e까지를 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.
	public String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0,s));
        for(int i = e ; i > s-1 ; i--) {
        	sb.append(my_string.charAt(i));
        }
        sb.append(my_string.substring(e+1, my_string.length()));
        return sb.toString();
    }
	
	public String solution02(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}
