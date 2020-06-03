package code;

import java.util.Scanner;

public class backJoon_4344 {
	public static void main(String[] arg){
		Scanner scan = new Scanner(System.in);
		int testCase = Integer.parseInt(scan.nextLine());
		
		for(int i=0; i<testCase; i++){
			int student = scan.nextInt();
			int[] score = new int[student];
			int ave = 0;
			int cnt = 0;
			
			for(int j=0; j<student; j++){
				score[j] = scan.nextInt();
				ave += score[j];
			}
			ave = ave/student;
			
			for(int j=0; j<student; j++){
				if(score[j] > ave){
					cnt ++;
				}
			}
			System.out.printf("%.3f",(double)cnt/student*100);
			System.out.println("%");
			
		}
		scan.close();
	}
}
