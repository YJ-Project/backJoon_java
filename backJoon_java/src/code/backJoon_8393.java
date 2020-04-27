package code;

import java.util.Scanner;

public class backJoon_8393 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		scan.close();
		int a = 0;
		for(int i=1; i<n+1; i++){
			a +=i;
		}
		System.out.println(a);
	}
}
