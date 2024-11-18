package com.gn.day12;

public class Solution04 {

	// 2의 영역
	// 정수 배열 arr가 주어집니다. 
	// 배열 안의 2가 모두 포함된 가장 작은 연속된 부분 배열을 
	// return 하는 solution 함수를 완성해 주세요.
	// 단, arr에 2가 없는 경우 [-1]을 return 합니다.
	
	public int[] solution(int[] arr) {
        int[] answer = {};
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < arr.length ; i++) {
        	if(arr[i]==2) {
        		start = i; break; 
        	}
        }
        for(int j = arr.length-1 ; j >=0 ; j--) {
        	if(arr[j]==2) {
        		end = j; break;
        	}
        }
        if(start == end) {
        	if(start == 0) answer = new int[]{-1}; 
        	else answer = new int[] {2};
        }else {
        	answer = new int[end-start+1];
        	for(int x = start, y=0 ; x <= end ; x++) {
        		answer[y++] = arr[x];
        	}
        }
        return answer;
    }
}
