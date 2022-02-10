package src.code_2000;

import java.util.Scanner;

public class backJoon_2577 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x = a*b*c;
		int[] result = new int[10];
		scan.close();
		
		while(x > 0){
			result[x%10]++;
			x = x/10;
		}
		
		for(int i=0; i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
