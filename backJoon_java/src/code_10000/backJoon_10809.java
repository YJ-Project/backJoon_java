package src.code_10000;

import java.util.Scanner;

public class backJoon_10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		scan.close();
		
		for(char i='a'; i<='z'; i++){
			System.out.print(s.indexOf(i)+" ");
		}
	}

}
