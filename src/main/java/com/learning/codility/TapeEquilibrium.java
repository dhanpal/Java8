package com.learning.codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibriumSolution sol = new TapeEquilibriumSolution();
		int [] A = {-1000, 1000};
		System.out.println(sol.solution(A));

	}

}
 class TapeEquilibriumSolution{
	 public int solution(int[] A){
		 long sumAllElements = 0;
		    for(int i=0; i<A.length; i++) {
		      sumAllElements += A[i];
		    }
		   
		    int minDifference = Integer.MAX_VALUE;
		    int currentDifference = Integer.MAX_VALUE;
		    
		    long leftSum = 0;
		    long rightSum = 0;
		    
		    for(int P = 0 ; P < A.length ; P++){
		    	leftSum = leftSum + A[P];
		    	rightSum = sumAllElements - leftSum;
		    	currentDifference = (int) Math.abs(leftSum - rightSum);
		    	minDifference = Math.min(minDifference, currentDifference);
		    }
		    
		    return minDifference;
	 }
 }