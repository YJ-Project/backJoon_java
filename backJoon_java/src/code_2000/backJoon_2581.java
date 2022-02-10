package src.code_2000;

import java.util.Scanner;

public class backJoon_2581 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = Integer.parseInt(scan.nextLine());
		int n = Integer.parseInt(scan.nextLine());
		int sum = 0;
		int min = n;
		for(int i=m; i<=n; i++){
			int result = 0;
			if(i==1) result++;

			for(int j=2; j<i; j++){
				if(i%j==0){
					result++;
					break;
				}
			}
			
			if(result==0){
				sum += i;
				if(min>i){
					min = i;
				}
			}
		}
		
		if(sum==0){
			System.out.println(-1);
		}else{
			System.out.println(sum);
			System.out.println(min);	
		}
		scan.close();
	}

}
