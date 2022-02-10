package src.code_2000;

import java.util.Scanner;

public class backJoon_2869 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
		int result = (v-a)/(a-b)+1;
		int today = (v-a)%(a-b) ==0?result:result+1;
		System.out.println(today);
		scan.close();
	}
}
