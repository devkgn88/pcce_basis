package com.gn.day06;

public class Solution04 {
	public int[] solution(int[] arr, int[][] queries) {
        for(int[] query : queries) {
        	int temp= arr[query[1]];
        	arr[query[1]] = arr[query[0]];
        	arr[query[0]] = temp;
        }
        return arr;
    }
}
