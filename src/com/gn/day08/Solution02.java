package com.gn.day08;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution02 {
	
	public int solution(int a, int b, int c, int d) {
		int answer = 0;
		int[] arr = {a,b,c,d};
		for(int i = 0 ; i < arr.length-1 ; i++) {
			for(int j = i ; j < arr.length ; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		if(arr[0] == arr[3]) {
			// all same
			answer = 1111 * arr[3];
		} else if (arr[0] == arr[2] || arr[1] == arr[3]) {
            answer = (arr[1] * 10 + (arr[0] + arr[3] - arr[1])) * (arr[1] * 10 + (arr[0] + arr[3] - arr[1]));
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            answer = (arr[0] + arr[3]) * (arr[3] - arr[0]);
        } else if (arr[0] == arr[1]) {
            answer = arr[2] * arr[3];
        } else if (arr[1] == arr[2]) {
            answer = arr[0] * arr[3];
        } else if (arr[2] == arr[3]) {
            answer = arr[0] * arr[1];
        } else {
            answer = arr[0];
        }
		return answer;
	}
		
	public int solution01(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(a, map.getOrDefault(a, 0)+1);
        map.put(b, map.getOrDefault(b, 0)+1);
        map.put(c, map.getOrDefault(c, 0)+1);
        map.put(d, map.getOrDefault(d, 0)+1);
        
        int p = 0;
        int q = 0;
        int r = 0;
        
        if(map.containsValue(4)) {	// 4
        	answer = 1111 * a;
        } else if(map.containsValue(3)) {	// 3,1
        	for(int key : map.keySet()) {
        		if(map.get(key) == 3) {
        			p = key;
        		}else {
        			q = key;
        		}
        	}
        	answer = (10 * p + q)*(10 * p + q);
        } else if(map.containsValue(2)) {
        	if(map.containsValue(1)) {	// 2,1,1
        		for(int key : map.keySet()) {
        			if(map.get(key) == 2) {
        				p = key;
        			} else {
        				if(q == 0) q = key;
        				else r = key;
        			}
        		}
        		answer = q*r;
        	}else {	// 2,2
        		for(int key : map.keySet()) {
        			if(p == 0) p = key;
        			else q = key;
        		}
        		answer = (p+q)*Math.abs(p-q);
        	}
        } else { // 1,1,1,1
        	answer = Collections.min(map.keySet());
        	
        }
        return answer;
    }
}
