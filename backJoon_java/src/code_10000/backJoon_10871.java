package src.code_10000;

import java.util.Scanner;

public class backJoon_10871 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		int j = 0;
		for(int i=0; i<n;i++){
			j = scan.nextInt();
			if(x>j){
				System.out.print(j+" ");
			}
		}
		scan.close();
	}
}
