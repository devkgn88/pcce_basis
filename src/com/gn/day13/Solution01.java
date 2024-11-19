package com.gn.day13;

import java.util.Arrays;

// n번째 원소부터
// 정수 리스트 num_list와 정수 n이 주어질 때, 
// n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 
// return하도록 solution 함수를 완성해주세요.
public class Solution01 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        for(int i = n-1, cnt = 0 ; i < num_list.length ; i++) {
        	answer[cnt++]=num_list[i];
        }
        return answer;
    }
    
    public int[] solution01(int[] num_list, int n) {
        int[] a= Arrays.copyOfRange(num_list, n-1, num_list.length);
        return a;
    }
}
