package com.gn.day06;

public class Solution05 {
	// You are given an integer array arr and a two-dimensional integer array queries.
	// The elements of queries each represent one query and have the form [s, e, k].
	// For each query, we find the smallest arr[i] greater than k for all i with s ≤ i ≤ e in order.
	// Please complete the solution function that returns an array storing the answers in the order of each query.
	// However, if the answer to a specific query does not exist, -1 is stored.
    public int[] solution(int[] arr, int[][] queries) {
    	int[] answer = new int[queries.length];
    	for(int i = 0 ; i < queries.length ; i++) {
    		Integer target = null;
    		Integer result = null;
        	for(int j = queries[i][0] ; j<= queries[i][1] ; j++) {
    			if(queries[i][2]<arr[j]) {
    				
    				int check = Math.abs(arr[j]-queries[i][2]);
    				System.out.println("누가 들어와"+arr[j]+" : "+check);
    				if(target != null) {
    					if(check < target) {
    						if(arr[j] < result) {
    							result = arr[j];
    							target = check;
    						}
    					}
    				} else {
    					target = check;
    					result = arr[j];
    				}
    			}
        	}	
        	answer[i] = result == null ? -1 : result;
    	}
        return answer;
    }
}
//        int[] answer = new int[queries.length];
//        for(int i = 0 ; i < arr.length-1 ; i++) {
//        	for(int j = i ; j< arr.length ;j++) {
//        		if(arr[i]>arr[j]) {
//        			int temp = arr[j];
//        			arr[j] = arr[i];
//        			arr[i] = temp;	
//        		}
//        	}
//        }
//        
//        for(int i = 0 ; i < queries.length ; i++) {
//        	int[] temp = new int[queries[i][1]-queries[i][0]+1];
//        	for(int x = queries[i][0] ; x <= queries[i][1] ; x++) {
//        		temp[x] = arr[x];
//        	}
//        	for(int j = queries[i][0] ; j<= queries[i][1] ; j++) {
//        		System.out.println(queries[i][2]+" < "+arr[j]);
//        		if(arr[j] > queries[i][2]) {
//        			
//        			answer[i] = arr[j];
//        			break;
//        		}
//        	}
//        }