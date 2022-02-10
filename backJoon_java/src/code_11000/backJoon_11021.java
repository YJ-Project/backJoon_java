package src.code_11000;

import java.util.Scanner;

public class backJoon_11021 {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int T = Integer.parseInt(scan.nextLine());
		for(int i=0 ; i < T ; i++){
			int a = Integer.parseInt(scan.next());
			int b = Integer.parseInt(scan.next());
			System.out.println("Case #"+(i+1)+": "+(a+b));
		}
		scan.close();
	}
}
