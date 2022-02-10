package src.code_1000;

import java.util.Scanner;

public class backJoon_1193 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		scan.close();
		int max = 0;
		int line = 0;
		//줄을 찾아야함
		for(int i=1;i<=x;i++){
			max += i;
			if(max>=x){
				line=i;
				break;
			}
		}
		//짝수는 오른쪽부터
		if(line%2==0){
			System.out.println((line-(max-x))+"/"+(1+max-x));
		}else{
			System.out.println((1+max-x)+"/"+(line-(max-x)));
		}
	}
}