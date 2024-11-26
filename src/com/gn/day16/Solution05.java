package com.gn.day16;

// 특정한 문자를 대문자로 바꾸기
// 영소문자로 이루어진 문자열 my_string과 
// 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때, 
// my_string에서 alp에 해당하는 모든 글자를 
// 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.
public class Solution05 {
	public String solution(
			String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for(String str : my_string.split("")) {
        	if(str.equals(alp)) {
        		sb.append(str.toUpperCase());
        	} else {
        		sb.append(str);
        	}
        }
        return sb.toString();
    }
	
	public String solution01(String my_string, String alp) {
        String a = alp.toUpperCase();
        return my_string.replaceAll( alp, a);
    }
}
