package code;

import java.util.Scanner;

public class backJoon_1110 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = n;
		int i = 0;
		scan.close();

		while(true){
			i++;
			x = (x%10*10)+((x/10+x%10)%10);
			if(n == x) break;
		}
		System.out.println(i);
	}
}

