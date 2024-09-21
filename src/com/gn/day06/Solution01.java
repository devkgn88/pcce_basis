package com.gn.day06;

public class Solution01 {
	public int[] solution(int[] num_list) {
        int leng = num_list.length;
        int[] answer = new int[leng+1];
        for(int i = 0 ; i < leng ; i++){
            answer[i] = num_list[i];
        } 
        
        int last = num_list[leng-1];
        int last_before = num_list[leng-2];
        if(last > last_before){
            answer[leng] = last - last_before;
        } else{
            answer[leng] = last * 2;
        }
        return answer;
    }
}
