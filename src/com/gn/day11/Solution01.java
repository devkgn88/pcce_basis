package com.gn.day11;

public class Solution01 {
	// 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때, 
	// my_string에서 'A'의 개수, my_string에서 'B'의 개수,..., 
	// my_string에서 'Z'의 개수, my_string에서 'a'의 개수, 
	// my_string에서 'b'의 개수,..., my_string에서 'z'의 개수를 
	// 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.
	public int[] solution(String my_string) {
		int[] answer = new int[52];
		int idx = 0;
		for(int i = 65 ; i <= 122 ; i++) {
			if((65 <= i && i <= 90) || (97 <= i && i <= 122)) {
	        	int count = 0;
	        	if(my_string.indexOf(i) != -1) {
	        		for(int j = 0 ; j < my_string.length() ; j++) {
	        			if(my_string.charAt(j) == i) {
	        				count++;
	        			}
	        		}
	        	} 
	        	answer[idx] = count;
	        	idx++;
				
			}
		}
		return answer;
	}
	
   public int[] solution02(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 65 && my_string.charAt(i) <= 90) {
                answer[my_string.charAt(i) - 'A'] += 1;
            }
            if (my_string.charAt(i) >= 97 && my_string.charAt(i) <= 122) {
                answer[my_string.charAt(i) - 'A' - 6] += 1;
            }
        }
        return answer;
    }

}
