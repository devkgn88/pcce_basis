package com.gn.day07;
// count up
public class Solution03 {
	// When Integer "start_num" and "end_num" are given
	// make solution method that returns a list
	// that contains ordered number 
	// from "start_num" to "end_num"
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        int idx = 0;
        for(int i = start_num ; i <= end_num ; i++){
            answer[idx] = i;
            idx++;
        }
        return answer;
    }
}
