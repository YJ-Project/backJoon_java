package src.code_1000;

import java.util.Scanner;

public class backJoon_1065 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int result = 0;
		
		if(n<100){
			result=n;
		}else{
			result = 99;
			
			for(int i=100; i<=n;i++){
				if((i/10%10)*2 == i/100+i%10){
					result++;
				}
			}
		}
		System.out.println(result);
	}
}
