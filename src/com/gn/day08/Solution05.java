package com.gn.day08;

public class Solution05 {
	public String solution01(String my_string, int[][] queries) {
		StringBuilder origin = new StringBuilder();
		origin.append(my_string);
		for(int i = 0 ; i < queries.length ; i++) {
			
			int from = queries[i][0];
			int to = queries[i][1];
			
			StringBuilder part = new StringBuilder();
			part.append(origin.substring(from, to+1));
			part.reverse();
			
			origin.replace(from, to+1, part.toString());
			
		}
		
		return origin.toString();
	}
	
	public String solution(String my_string, int[][] queries) {
		
		// 0,1,2,3,4,5,6,7,8,9,10
		// === 2,3 ===
		// 0,1
		// 3,2
		// 4,5,6,7,8,9,10
		// === 0,7 === -> 처음꺼 없을때는 앞 인덱스 == 0
		// 
		// 7,6,5,4,3,2,1,0
		// 8,9,10
		// === 5,9 ===
		// 0,1,2,3,4
		// 9,8,7,6,5
		// 10
		// === 6,10 === -> 마지막거 없을때는 length-1 == 뒷 인덱스
		// 0,1,2,3,4,5
		// 10,9,8,7,6
		// 
		
		
		
		
		
        String target = my_string;
        String answer = "";
        
        for(int i = 0 ; i < queries.length; i++) {
        	if(queries[i][0] != 0) {
        		for(int a = 0 ; a < queries[i][0] ; a++) {
        			answer += target.charAt(a);
        		}
        	}
        	for(int b = queries[i][1] ; queries[i][0] <= b ; b--) {
        		answer += target.charAt(b);
        	}
        	if(queries[i][1] != my_string.length()-1) {
        		for(int c = queries[i][1]+1 ; c < my_string.length() ; c++) {
        			System.out.print(target.charAt(c)+", ");
        			answer += target.charAt(c);
        		}
        	}
        	target = answer;
        	answer = "";
        }
        return answer;
    }
}
