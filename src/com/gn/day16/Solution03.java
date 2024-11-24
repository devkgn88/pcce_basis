package com.gn.day16;

public class Solution03 {
	// 배열에서 문자열 대소문자 변경하기
	// 문자열 배열 strArr가 주어집니다. 
	// 모든 원소가 알파벳으로만 이루어져 있을 때, 
	// 배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
	// 짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
    public String[] solution(String[] strArr) {
        for(int i = 0 ; i < strArr.length ; i++) {
        	if(i%2==0) strArr[i] = strArr[i].toLowerCase();
        	else strArr[i] = strArr[i].toUpperCase();
        }
        return strArr;
    }
}
