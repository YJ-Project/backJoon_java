package src.code_10000;

import java.util.Scanner;

public class backJoon_10950 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<N;i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		scan.close();
	}
}
