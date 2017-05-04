package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Class {
	
	public Class() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String[] r = {"Joe", "Kim", "Chris"};
        int[][] g = {{80, 90, 90, 100, 70},
		            {90, 60, 75, 80, 80},
		             {100, 90, 96, 98, 99}};
        bestAverage(r,g);
	}

	public static int maxDistBetweenAny2(int[][] nums){
		int min = nums[0][0];
        int max = nums[0][0];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] < min){
                    min = nums[i][j];
                }
                if(nums[i][j] > max){
                    max = nums[i][j];
                }
            }
        }
        return max - min;
	}
	
	public static String bestAverage(String[] roster, int[][] grades){
		int average = 0;
		ArrayList<Integer> avg = new ArrayList<Integer>();
		for(int row = 0; row < grades.length; row++){
			for(int col = 0; col < grades[0].length; col++){
				average += grades[row][col];
				if(col == grades[0].length - 1){
					avg.add(average/col);
				}
			}
		}
		System.out.println(avg);
		return "";
	}
}
