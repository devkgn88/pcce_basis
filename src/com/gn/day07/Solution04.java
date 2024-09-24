package com.gn.day07;

import java.util.ArrayList;
import java.util.List;

public class Solution04 {
	// Colatz sequence
	public int[] solution(int n) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(n);
        while(n != 1) {
        	if(n % 2 == 0) {
        		n /= 2;	
        	}else {
        		n = 3*n +1;
        	}
        	list.add(n);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
