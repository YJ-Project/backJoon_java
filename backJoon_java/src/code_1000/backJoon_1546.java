package src.code_1000;

import java.util.Scanner;

public class backJoon_1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double score = 0;
		double max = 0;
		double ave = 0;
		for(int i=0; i<n; i++){
			score=scan.nextInt();
			ave += score; 
			if(max < score){
				max = score;
			}
		}
		System.out.println(ave/max*100/n);
		scan.close();
	}
}