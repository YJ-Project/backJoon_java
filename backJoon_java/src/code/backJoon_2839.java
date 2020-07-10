package code;

import java.io.IOException;
import java.util.Scanner;

public class backJoon_2839 {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		
		//5로 나눴을때 잘되는게 최우선
		if(n%5==0){
			System.out.println(n/5);
		}else{
			//5로 최대한 나눈뒤 3으로 나누어졌을때 가능한거
			int max_num = n/5;
			for(int i=max_num; i>0; i--){
				int calc = n-(5*i);
				if(calc%3==0){
					System.out.println(i+(calc/3));
					return;
				}
			} 
			
			//3으로 최대한 나누는거
			if(n%3==0){
				System.out.println(n/3);
			}else{
				System.out.println(-1);
			}
		}
	}
}