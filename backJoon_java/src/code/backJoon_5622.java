package code;

import java.util.Scanner;

public class backJoon_5622 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		scan.close();
		int time = 0;
		
		for(int i=0; i<num.length();i++){
			char text = num.charAt(i);
			if(text >='A' && text <= 'C'){
				time += 3;
			}else if(text >='D' && text <= 'F'){
				time += 4;
			}else if(text >='G' && text <= 'I'){
				time += 5;
			}else if(text >='J' && text <= 'L'){
				time += 6;
			}else if(text >='M' && text <= 'O'){
				time += 7;
			}else if(text >='P' && text <= 'S'){
				time += 8;
			}else if(text >='T' && text <= 'V'){
				time += 9;
			}else{
				time += 10;
			}
			
		}
		System.out.println(time);
	}
}
