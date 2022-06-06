import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int counter = 0;
		double sum = 0;
		int [][] arr = new int [5][4];
		int rows = arr.length;
		int cols = arr[0].length;
		for(int x = 0; x < rows; x++){
			for(int y = 0; y < cols; y++){
				sum = sum + arr[x][y];
				counter++;
			//	arr[x][y] = (int)(Math.random()*5);
			// System.out.println(arr[x][y]);
			}
				System.out.println(sum / counter);
		}
		
		// System.out.println(sum / counter);
	

		
	}
}
