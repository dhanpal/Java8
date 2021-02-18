package com.learning.codility;

class Solution {
    
	public static void main(String[] args){
		Temp temp = new Temp();
		int[] A = {1,1,2,2,};
		int Y = 500;
		System.out.println(temp.solution(A, Y));
	}
}

class Temp{
public int solution(int[] A, int Y) {
	int finalResult = 0;
    int start = 0;
    while (start < A.length) {
        int end = start;
        while (end < A.length && A[end] == A[start]) {
            ++end;
        }
        finalResult = Math.max(finalResult, end - start + Math.min(Y, A.length - end));

        start = end;
    }
    assert finalResult >= Math.min(Y + 1, A.length);
    return finalResult;
    }
}