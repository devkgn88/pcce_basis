package com.gn.day12;

import java.util.Arrays;

// 배열 조각하기
// 정수 배열 arr와 query가 주어집니다.
// query를 순회하면서 다음 작업을 반복합니다.
// 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 
// 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
// 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 
// 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
// 위 작업을 마친 후 남은 arr의 부분 배열을 
// return 하는 solution 함수를 완성해 주세요.
public class Solution05 {
	public int[] solution(int[] arr, int[] query) {		
        for(int i = 0 ; i < query.length ; i++) {
        	if(i % 2 == 0) {
        		// i가 짝수일때
        		int[] even = new int[query[i]+1];
        		for(int j = 0 ; j <= query[i] ; j++) {
        			even[j] = arr[j];
        		}
        		arr = new int[even.length];
        		for(int x = 0 ; x < even.length ; x++) {
        			arr[x]=even[x];
        		}

        	} else {
        		// i가 홀수일때
        		int[] odd = new int[arr.length-query[i]];
        		int count = 0;
        		for(int j = query[i] ; j <arr.length ; j++) {
        			odd[count++] = arr[j];
        		}
        		arr =  new int[odd.length];
        		for(int y = 0 ; y < odd.length ;y++) {
        			arr[y] = odd[y];
        		}
        	}
        }       
        return arr;
    }
	
	// 실시간으로 배열 사이즈를 줄이지 않고
	// 시작과 종료 인덱스만 조절
    public int[] solution01(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
}
