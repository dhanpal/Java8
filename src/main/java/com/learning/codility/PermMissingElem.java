package com.learning.codility;

import java.util.Arrays;

public class PermMissingElem {

	public static void main(String[] args) {
		PermMissingElemSolution sol = new PermMissingElemSolution();
		int[] A = {2,3,1,5};
		System.out.println(sol.solution(A));

	}

}

class PermMissingElemSolution{
	public int solution(int[] A){
		int missingValue = 1;
		Arrays.sort(A);
		if(A.length == 0){
			return 1;
		}
		if (A.length == 1){
			if(A[0] == 1){
				return 2;
			}else{
				return 1;
			}
		}
		int i=0;
		while(i < A.length-1){
			if(A[0] != 1){
				return 1;
			}
			if(A[i]+1 == A[i+1]){
				i++;
				missingValue = A[i]+1;
			}
			else{
				return A[i]+1;
			}
		}
		
		return missingValue;
	}
}