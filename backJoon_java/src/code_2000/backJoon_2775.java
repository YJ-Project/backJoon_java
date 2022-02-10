package src.code_2000;

import java.util.Scanner;

public class backJoon_2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt(); //test case

		int [][] apartment = new int[15][15];
		
		//초기값 설정
		for(int i=0;i<=14;i++){
			apartment[i][1] = 1;
			apartment[0][i] = i;
		}

		//초기값 이외의 설정
		for(int i=0;i<t;i++){
			int k = scan.nextInt(); //층
			int n = scan.nextInt(); //호
			
			for(int j=1; j<=k; j++){//층만큼 뺑뺑이
				for(int p=2; p<n+1;p++){
					apartment[j][p] = apartment[j-1][p]+apartment[j][p-1];
				}
			}
			System.out.println(apartment[k][n]);
		}
		scan.close();
	}
}
