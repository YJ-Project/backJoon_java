package src.code_2000;

import java.util.Scanner;

public class backJoon_2742 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		scan.close();
		for(int i=N ; i > 0 ; i--){
			System.out.println(i);
		}
	}
}
