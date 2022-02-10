package src.code_1000;

import java.util.Scanner;

public class backJoon_1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int result = n;
		for(int i=0; i<n; i++){
			int temp = scan.nextInt();
			if(temp==1) result--;
			for(int j=2;j<temp;j++){
				if(temp%j==0){
					result--;
					break;
				}
			}
		}
		System.out.println(result);
		scan.close();
	}

}
