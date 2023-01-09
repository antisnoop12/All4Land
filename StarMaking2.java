package homework2;

import java.util.Arrays;

public class StarMaking2 {
	public static void main(String[] args) {
		draw6(5);
		char a[] = new char[5];
		Arrays.fill(a, 0, 2, '+');
		Arrays.fill(a, 2, 5, '-');
		System.out.println(String.valueOf(a));
		System.out.println(a);
	}
	private static void draw6(int size) { //size=5
	    int centerLine = (int) (size / 2) + 1; // centerLine = 3
	    int start = -size + centerLine; // start = -2  
	    int end = size - (centerLine - 1); //end = 3   
	    //math.abs = 절대값
	    // rowNumber = -2 -1 0 1 2
	    for (int rowNumber = start; rowNumber < end; rowNumber++) {
	        int arraySize = 2 * size - Math.abs(rowNumber) - size; // 3 , 4 , 5 , 4 , 3
	        char row[] = new char[arraySize]; // 
	        Arrays.fill(row, 0, Math.abs(rowNumber), ' ');
	        Arrays.fill(row, Math.abs(rowNumber), row.length, '*');
	        System.out.println(String.valueOf(row));
	    }
	}
	
}
