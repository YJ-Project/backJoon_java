package src.code_11000;

import java.util.Scanner;

public class backJoon_11720 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String num = scan.next();
		int result = 0;
		
		for(int i=0; i<n; i++){
			result += Integer.parseInt(String.valueOf(num.charAt(i)));
		}
		
		System.out.println(result);
		scan.close();
	}

}
