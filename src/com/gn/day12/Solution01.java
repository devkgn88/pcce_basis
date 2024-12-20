package com.gn.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution01 {
	// 리스트 자르기
	// 정수 n과 정수 3개가 담긴 리스트 slicer 
	// 그리고 정수 여러 개가 담긴 리스트 num_list가 주어집니다. 
	// slicer에 담긴 정수를 차례대로 a, b, c라고 할 때, 
	// n에 따라 다음과 같이 num_list를 슬라이싱 하려고 합니다.

	// n = 1 : num_list의 0번 인덱스부터 b번->slicer[1] 인덱스까지
	// n = 2 : num_list의 a번->slicer[0] 인덱스부터 마지막 인덱스까지
	// n = 3 : num_list의 a-> slicer[0]번 인덱스부터 b->slicer[1]번 인덱스까지
	// n = 4 : num_list의 a번 인덱스부터 b번 인덱스까지 c 간격으로
	// 올바르게 슬라이싱한 리스트를 return하도록 solution 함수를 완성해주세요.
	public int[] solution(int n, int[] slicer, int[] num_list) {
	    int start = n==1 ? 0 : slicer[0];
	    int end = n==2 ? num_list.length-1 : slicer[1];
	    int interval = n==4 ? slicer[2] : 1;
	    int[] answer = new int[(end - start + interval) / interval];
	    for(int i = start, j=0; i <= end ; i+=interval) {
	    	answer[j++] = num_list[i];
	    }
	    return answer;
	}
	
	
	public List<Integer> solution01(int n, int[] slicer, int[] num_list) {
	    List<Integer> list = new ArrayList<Integer>();
	    int start = slicer[0];
	    int end = slicer[1];
	    int interval = 1;
	    switch(n) {
	    	case 1 : start = 0; break;
	    	case 2 : end=num_list.length-1; break;
	    	case 3 : break;
	    	case 4 : interval = slicer[2]; break;
	    }
	    for(int i = start; i <= end ; i+=interval) {
	    	list.add(num_list[i]);
	    }
	    return list;
	}
}
