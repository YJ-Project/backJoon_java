package code;

import java.util.Scanner;

public class backJoon_1546 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int score = 0;
		int max = 0;
		int ave = 0;
		for(int i=0; i<n; i++){
			score=scan.nextInt();
			ave += score; 
			if(max < score){
				max = score;
			}
		}
		System.out.println((double)ave/(double)max*100/n);
		scan.close();
	}
}