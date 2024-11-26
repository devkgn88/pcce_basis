package com.gn.day16;

// A강조하기
// 문자열 myString이 주어집니다. 
// myString에서 알파벳 "a"가 등장하면 전부 "A"로 변환하고, 
// "A"가 아닌 모든 대문자 알파벳은 소문자 알파벳으로 변환하여 
// return 하는 solution 함수를 완성하세요.
public class Solution04 {
	public String solution(String myString) {
//        StringBuilder sb = new StringBuilder();
//
//        for(int i = 0 ;  i < myString.length() ; i++){
//            int num = (int)myString.charAt(i);
//            if(num == 97){
//                sb.append('A');
//            } else if (65 <= num && num <= 90) {
//            	sb.append((char)(num+32));
//            } else{
//                sb.append(myString.charAt(i));
//            }
//        }        
//        return sb.toString();
		myString = myString.toLowerCase();
		myString = myString.replaceAll("a", "A");
		return myString;
    }
}
