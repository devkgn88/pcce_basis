package com.gn.day08;

public class Solution04 {
	public int solution(String number) {
        int answer = 0;
        // 123
        // 123 % 10 -> 3 
        // 12  % 10 -> 2
        // 12 % 10 -> 1
        // 1 % 10 -> 1 (나누기 대상과 결과가 같아질때까지 나누기)
        for(String str : number.split("")) {
        	answer += Integer.parseInt(str);
        }
        return answer % 9;
    }
}
