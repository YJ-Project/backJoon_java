package src.code_2000;

import java.util.Scanner;

public class backJoon_2439 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		for(int i=1 ; i < T+1 ; i++){
			for(int k=i; k<T ; k++){
				System.out.print(" ");
			}
			
			for(int j=0; j<i ; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
		scan.close();
	}
}
