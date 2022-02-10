package src.code_1000;

import java.util.Scanner;

public class backJoon_1929 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		scan.close();
		
		for(int i=m; i<=n; i++){
			int result = 0;
			int half = (int)Math.sqrt(i);
			if(i==1) result++;

			for(int j=2; j<=half; j++){
				if(i%j==0){
					result++;
					break;
				}
			}
			
			if(result==0){
				System.out.println(i);
			}
		}
		
	}

}
