package com.gn.day11;

// 카운트 다운
public class Solution04 {
	// 정수 start_num와 end_num가 주어질 때, 
	// start_num에서 end_num까지 1씩 감소하는 수들을 
	// 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
	// 0 ≤ end_num ≤ start_num ≤ 50
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num-end_num+1];
        int cnt = 0;
        for(int i = start_num ; i >= end_num ; i--) {
        	answer[cnt] = i;
        	cnt++;
        }
        return answer;
    }
    
    public int[] solution01(int start, int end) {
        int[] answer = new int[start-end+1];
        for(int i=0; i<=start-end; i++) {
            answer[i] = start - i;
        }
        return answer;
    }
}
