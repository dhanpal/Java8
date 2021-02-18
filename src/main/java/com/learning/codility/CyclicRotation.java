package com.learning.codility;

public class CyclicRotation {

	public static void main(String[] args) {
		SolutionCyclicRotation solution = new SolutionCyclicRotation();
		int K = 4;
		int[] A = {1, 2, 3, 4};
		A = solution.solution(A, K);
		for(int j : A){
			System.out.println(j);
		}

	}
}

class SolutionCyclicRotation{
	public int[] solution(int[] A, int K){
		int [] finalArray = new int [A.length];
		
		for(int i = 0 ; i < A.length ; i++){
			
			if(i+K < A.length){
				finalArray[i+K] = A[i];
			}
			else{
				finalArray[i+K-A.length] = A[i];
			}

		}
		
		return finalArray;
	}
}