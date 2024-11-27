package com.gn.day17;

public class Solution02 {
	public int solution(String myString, String pat) {
        int answer = 0;
        int len = pat.length();
        
        for(int i = 0 ; i <= myString.length()-len; i++){
            String cut = myString.substring(i,i+len);
            if(pat.equals(cut)){
                answer++;
            }
        }
        return answer;
    }
}
