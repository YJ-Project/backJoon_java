package src.code_10000;

import java.util.Arrays;
import java.util.Scanner;

public class backJoon_10817 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num_array = new int[3];
		
		for(int i=0; i<num_array.length; i++){
			num_array[i] = scan.nextInt();
		}
		Arrays.sort(num_array);
		System.out.println(num_array[1]);
		
		scan.close();
	}
}
