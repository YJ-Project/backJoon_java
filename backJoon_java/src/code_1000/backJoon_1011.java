package src.code_1000;

import java.util.Scanner;

public class backJoon_1011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());

		for(int i=0; i<t; i++){
			long x = scan.nextLong();
			long y = scan.nextLong();
			long distance = y-x;
			long max = (int)Math.sqrt(distance);

			//0~1, 0~4, 0~9
			if(max == Math.sqrt(distance)){
				System.out.println(2*max-1);
			//0~2,0~5, 0~6	
			}else if( Math.sqrt(distance) - max <= 0.5 ){
				System.out.println(2*max);
			//0~3, 0~7, 0~8
			}else{
				System.out.println(2*max+1);
			}
		}
		scan.close();
	}
}
