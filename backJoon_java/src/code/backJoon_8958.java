package code;

import java.util.Scanner;

public class backJoon_8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for(int i = 0; i< n; i++){
			String ox = scan.nextLine();
			int count = 0;
			int result = 0;
			for(int j=0; j<ox.length(); j++){
				if(ox.charAt(j) == 'O'){
					count++;
					result += count;
				}else{
					count = 0;
				}
			}
			System.out.println(result);
		}
		scan.close();
	}
}
