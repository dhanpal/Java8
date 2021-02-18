package com.learning.codility;

import java.util.Arrays;

public class OddOccurrencesInArray {

	public static void main(String[] args) {
		OddOccurrencesInArraySolution solution = new OddOccurrencesInArraySolution();
		int [] A = {1,1,1};
		System.out.println(solution.solution(A));

	}

}

class OddOccurrencesInArraySolution{
	public int solution(int[] A){
		int unpaired = 0;
		if(A.length == 1){
			return A[0];
		}
		Arrays.sort(A);
		int i =0;
		while(i<A.length){
			if(i == A.length-1){
				return A[i];
			}
			if(A[i] == A[i+1]){
				i = i+2;
			}
			else{
				return A[i];
			}
		}	
		return unpaired;
	}
}