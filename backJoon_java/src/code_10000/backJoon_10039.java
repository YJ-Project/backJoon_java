package src.code_10000;

import java.util.Scanner;

public class backJoon_10039 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0 ;
		
		for(int i=0; i<5; i++){
			int score = scan.nextInt();
			total += score <40 ? 40 : score;
		}
		scan.close();
		System.out.println(total/5);
	}
}
