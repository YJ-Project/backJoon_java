package code;

import java.util.Scanner;

public class backJoon_2908 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] number = scan.nextLine().split(" ");
		int[] result = new int[number.length];
		
		for(int i=0; i<number.length; i++){
			String reverse = "";
			for(int j=0; j<number[i].length(); j++){
				reverse += number[i].charAt(number[i].length()-j-1);
			}
			result[i] = Integer.parseInt(reverse);
		}
		
		if(result[0] < result[1]){
			System.out.println(result[1]);
		}else{
			System.out.println(result[0]);
		}
		
		scan.close();
	}
}
