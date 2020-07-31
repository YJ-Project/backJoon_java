package code;

import java.util.Scanner;

public class backJoon_9020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean[] num_list = new boolean[10001];
		for(int i=2; i<=10000; i++){
			int result = 0;
			int half = (int)Math.sqrt(i);
			if(i==1) result++;

			for(int j=2; j<=half; j++){
				if(i%j==0){
					result++;
					num_list[i]=false;
					break;
				}
			}
			
			if(result==0){
				num_list[i]=true;
			}
		}

		int t = scan.nextInt();
		for(int i=0; i<t; i++){
			int n = scan.nextInt();
			int k = n;
			int diff =n;
			for(int j=2; j<=n/2; j++){
				if(num_list[j] && num_list[n-j]){
					if(diff > (n-2*j)){
						k=j;
						diff = n-2*j;
					}
				}
			}

			System.out.println(k+" "+(n-k));
		}
		scan.close();
	}

}
