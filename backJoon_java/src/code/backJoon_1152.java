package code;

import java.util.Scanner;

public class backJoon_1152 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String[] words = scan.nextLine().trim().split(" ");
		if(words[0].isEmpty()){
			System.out.println(0);
		}else{
			System.out.println(words.length);
		}
		scan.close();
	}
}
