package code;

import java.util.Scanner;

public class backJoon_2446 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=0; i<n;i++){
			for(int k=i; k>0; k--){
				System.out.print(" ");
			}
			
			for(int j=2*(n-i)-1; j>0; j--){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>0;i--){
			for(int k=i-1; k>0; k--){
				System.out.print(" ");
			}
			for(int j=i; j<2*n-i+1; j++){
				System.out.print("*");
			}
			System.out.println();

		}
		scan.close();
	}
}
