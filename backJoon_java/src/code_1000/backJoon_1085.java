package src.code_1000;

import java.util.Scanner;

public class backJoon_1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		scan.close();
		int x_min = Math.min(w-x, x);
		int y_min = Math.min(h-y, y);
		if(x_min>y_min){
			System.out.println(y_min);
		}else{
			System.out.println(x_min);
		}
	}

}
