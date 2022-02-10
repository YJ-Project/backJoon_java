package src.code_2000;

import java.util.Scanner;

public class backJoon_2292 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int row=1;
		int last_num=1;
		while(true){
			if(last_num>=n) break;
			last_num+=6*row;
			row++;
		}
			System.out.println(row);
	}
}
