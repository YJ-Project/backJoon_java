package src.code_1000;

import java.util.Scanner;

public class backJoon_1157 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine().toUpperCase(); //대소문자 구별하지 않기위해
		scan.close();
		int[] arr = new int[26];
		int max = 0;
		char result ='?'; 
		for(int i=0; i<word.length(); i++){
			arr[word.charAt(i)-'A']++; //index를 0부터 하기 위해서 arr[0]=>'A'값이 들어가도록
			if(max < arr[word.charAt(i)-'A']){
				max = arr[word.charAt(i)-'A'];
				result = word.charAt(i);
			}else if(max == arr[word.charAt(i)-'A']){ //가장 많이 사용된 알파벳이 여러 개 존재
				result='?';
			}
		}
		System.out.println(result);
	}
}
