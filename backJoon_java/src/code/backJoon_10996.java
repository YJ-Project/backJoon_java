package code;

import java.util.Scanner;

public class backJoon_10996 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		int old_num = n-(n/2);
		int even_num = n/2;

		for(int i=1; i<(2*n)+1; i++){
			if(i%2!=0){
				for(int j=0; j<old_num; j++){
					System.out.print("* ");
				}
				System.out.println();
			}else{
				for(int j=0; j<even_num; j++){
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}
}
