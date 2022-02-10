package src.code_5000;

import java.util.Scanner;

public class backJoon_5543 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int b_min = 2000;
		int d_min = 2000;
		
		for(int i=0; i<3;i++){
			int b = scan.nextInt();
			if(b_min>b){
				b_min = b;
			}
		}
		
		for(int i=0; i<2;i++){
			int d = scan.nextInt();
			if(d_min>d){
				d_min = d;
			}
		}
		
		System.out.println(b_min+d_min-50);
		scan.close();
	}
}
