package com.gn.day08;

public class Solution04 {
	public int solution(String number) {
        int answer = 0;
        for(String str : number.split("")) {
        	answer += Integer.parseInt(str);
        }
        return answer % 9;
    }
}
