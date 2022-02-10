package src.code_3000;

import java.util.HashMap;
import java.util.Scanner;

public class backJoon_3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> x_map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> y_map = new HashMap<Integer, Integer>();
		int x = 0;
		int y = 0;
		for(int i=0;i<3;i++){
			x = scan.nextInt();
			y = scan.nextInt();
			x_map.put(x, x_map.getOrDefault(x, 0)+1);
			y_map.put(y, y_map.getOrDefault(y, 0)-1);
		}
		
		for(Integer i : x_map.keySet()){
			if(x_map.get(i)==1){
				x = i;
			}
		}
		
		for(Integer i : y_map.keySet()){
			if(y_map.get(i)==-1){
				y = i;
			}
		}
		
		System.out.println(x+" "+y);
		scan.close();
	}

}
