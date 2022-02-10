package src.code_2000;

import java.util.Scanner;

public class backJoon_2523 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=1; i<n+1; i++){
			for(int j=1; j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i=n-1; i>0; i--){
			for(int j=i; j>0;j--){
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scan.close();
	}
}
