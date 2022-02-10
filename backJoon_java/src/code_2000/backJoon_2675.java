package src.code_2000;

import java.util.Scanner;

public class backJoon_2675 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		for(int i=0; i<t; i++){
			int cnt = scan.nextInt();
			String r = scan.next();
			for(int k=0; k<r.length(); k++){
				for(int j=0; j<cnt; j++){
					System.out.print(r.charAt(k));
				}
			}
			System.out.println();
		}
		scan.close();
	}
}

