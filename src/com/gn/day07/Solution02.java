package com.gn.day07;

import java.util.ArrayList;
import java.util.List;

public class Solution02 {
	// Given integers l and r, 
	// please complete the solution function 
	// that returns an array that stores in ascending order all integers 
	// consisting of only the numbers "0" and "5" 
	// among the integers greater than l and less than r.
	// If there is no such integer, an array containing -1 is returned.
	public int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<Integer>();
        for(int i = l ; i <= r ; i++) {
        	if(i % 5 != 0) {
        		continue;
        	} else {
        		String str = String.valueOf(i);
        		boolean bool = false;
        		for(String piece : str.split("")) {
        			if(piece.equals("0") || piece.equals("5")) {
        				bool = true;
        			} else {
        				bool = false;
        				break;
        			}
        		}
        		if(bool == true) {
        			list.add(Integer.parseInt(str));
        		}
        	}
        	
        }
        if(list.size() == 0) list.add(-1);
        return list.stream().mapToInt(i->i).toArray();
    }
}
