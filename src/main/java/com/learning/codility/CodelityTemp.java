package com.learning.codility;

import java.util.ArrayList;
import java.util.Arrays;

public class CodelityTemp {
public static void main(String[] args){
	Solution1 solution1 = new Solution1();
	
	System.out.println(Arrays.toString(solution1.solution(10, 6)));
}
}
class Solution1 {
    public String[] solution(int N, int K) {
    	if (N == 0 || K == 0) {
            return new String[] {""};
        }
        ArrayList<String> result = new ArrayList<String>();
        for (String p : solution(N - 1, K)) {
            for (char l : new char[] {'a', 'b', 'c'}) {
                int pLen = p.length();
                if (pLen == 0 || p.charAt(pLen - 1) != l) {
                    result.add(p + l);
                }
            }
        }
        int prefSize = Math.min(result.size(), K);
        return result.subList(0, prefSize).toArray(new String[prefSize]);
    
    }
}