package src.code_4000;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class backJoon_4153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			ArrayList<Integer> list = new ArrayList<>();
			int x = 0;
			for(int i=0; i<3; i++){
				x = scan.nextInt();
				list.add(x);
			}
			if(x==0) break;

			list.sort(Comparator.naturalOrder());
			
			if(Math.pow(list.get(2), 2)== Math.pow(list.get(0), 2)+Math.pow(list.get(1), 2)){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}	
		}
		scan.close();
	}

}
