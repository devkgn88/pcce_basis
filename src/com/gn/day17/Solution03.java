package com.gn.day17;

import java.util.ArrayList;
import java.util.List;

public class Solution03 {
	public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<String>();
        for(String str : strArr){
            if(str.indexOf("ad") == -1){
                list.add(str);
            }
        }
        
         String[] answer  = new String[list.size()];
        list.toArray(answer);
        return answer;
    }
}
