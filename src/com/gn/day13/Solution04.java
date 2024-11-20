package com.gn.day13;

import java.util.Arrays;

// n번째 원소까지
// 정수 리스트 num_list와 정수 n이 주어질 때, 
// num_list의 첫 번째 원소부터 n 번째 원소까지의 
// 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
public class Solution04 {
	public int[] solution01(int[] num_list, int n) {
        int[] answer = new int[n];
        System.arraycopy(num_list, 0, answer, 0, n);
        return answer;
    }
	
	public int[] solution(int[] num_list, int n) {        
        return Arrays.copyOfRange(num_list, 0, n);
    }
	

}
