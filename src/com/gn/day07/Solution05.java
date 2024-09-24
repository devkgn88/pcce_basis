package com.gn.day07;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution05 {
	public int[] solution(int[] arr) {
		Stack<Integer> stk = new Stack<Integer>();
		int i = 0 ;
		while(i < arr.length) {
			if(stk.isEmpty()) {
				stk.push(arr[i]);
				i++;
			} else {
				if(stk.get(stk.size()-1) < arr[i]) {
        			stk.push(arr[i]);
        			i++;
        		}else {
        			stk.pop();
        		}
			}
		}
		return stk.stream().mapToInt(j->j).toArray();
	}
	
	
	public int[] solution01(int[] arr) {
        List<Integer> stk = new ArrayList<Integer>();
        
        int i = 0;
        while(i < arr.length) {  
        	if(stk.isEmpty()) {		
        		stk.add(arr[i]);
        		i++;				
        	} else {				
        		if(stk.get(stk.size()-1) < arr[i]) {
        			stk.add(arr[i]);
        			i++;
        		}else {
        			stk.remove(stk.size()-1);
        		}
        	}
            
        }
        return stk.stream().mapToInt(j->j).toArray();
    }
}
