package com.learning.codility;

public class FrogJmp {

	public static void main(String[] args) {
		
		FrogJmpSolution solution = new FrogJmpSolution();
		System.out.println(solution.solution(10, 85, 30));
	}

}

class FrogJmpSolution{
	public int solution(int X, int Y, int D){
		
		int jump = 0;
		if(Y <= X){
			return 0;
		}

		jump = (int) Math.ceil((double)(Y-X)/D);
		
		return jump;
	}
}