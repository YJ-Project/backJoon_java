package code;

import java.util.Scanner;

public class backJoon_2438 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		for(int i=1 ; i < T+1 ; i++){
			for(int j=0; j<i ; j++){
				System.out.print("*");	
			}
			System.out.println();
		}
		scan.close();
	}
}
