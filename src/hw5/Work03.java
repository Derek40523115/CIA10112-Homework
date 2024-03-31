package hw5;

import java.util.Arrays;

public class Work03 {
	public int maxElement(int[][] array) {
		int max = array[0][0];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		return max;
		}
	public double maxElement(double[][] array) {
		double max = array[0][0];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(max < array[i][j]) {
					max = array[i][j];
				}
			}
		}
		return max;
		}
	
	}
