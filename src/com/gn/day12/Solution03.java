package com.gn.day12;

// 배열 만들기 3
// Create an Array 3
public class Solution03 {
	// 정수 배열 arr와 2개의 구간이 담긴 배열 intervals가 주어집니다.
	// intervals는 항상 [[a1, b1], [a2, b2]]의 꼴로 주어지며 
	// 각 구간은 닫힌 구간입니다. 
	// 닫힌 구간은 양 끝값과 그 사이의 값을 모두 포함하는 구간을 의미합니다.
	// 이때 배열 arr의 첫 번째 구간에 해당하는 배열과 
	// 두 번째 구간에 해당하는 배열을 앞뒤로 붙여 새로운 배열을 만들어 
	// return 하는 solution 함수를 완성해 주세요.
	public int[] solution(int[] arr, int[][] intervals) {
		int leng = (intervals[0][1]-intervals[0][0])
				+(intervals[1][1]-intervals[1][0]) +2;
    	int[] answer = new int[leng];
    	int cnt = 0 ; 
    	for(int i = 0 ; i < intervals.length ; i++) {
    		for(int j = intervals[i][0] ; j <= intervals[i][1] ; j++) {
    			answer[cnt++] = arr[j];
    		}
    	}
    	return answer;
	}
}
