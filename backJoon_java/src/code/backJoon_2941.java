package code;

import java.util.Scanner;

public class backJoon_2941 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String alphabat = scan.nextLine();
		scan.close();
		String[] c = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(int i=0; i<c.length;i++){
			while(alphabat.contains(c[i])){
				alphabat = alphabat.replaceFirst(c[i], " ");
			}
		}
		System.out.println(alphabat.length());
	}

}
