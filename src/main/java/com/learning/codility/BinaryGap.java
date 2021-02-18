package com.learning.codility;

public class BinaryGap {

	public static void main(String[] args) {
		SolutionNew solution = new SolutionNew();
		System.out.println(solution.solution(32));

	}

}
class SolutionNew{
	public int solution(int N){
		int gap = 0;
		String str = Integer.toBinaryString(N);
		String [] arr = str.split("");
		int totalcount = 0;
		int first = 0;
		int last = 0;
		for(int i = 0; i<arr.length ; i++){
			
			if(arr[i].equals("1")){
				totalcount++;
				first = last+1;
				last = i;
				if(last-first > gap){
					gap = last - first;
				}
			}
			
		}
		if(totalcount == 1){
			return 0;
		}
		return gap;
	}
}