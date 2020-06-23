package code;

import java.util.HashSet;
import java.util.Iterator;

public class backJoon_4673 {

	public static void main(String[] args) {
		HashSet<Integer> all_set = new HashSet<Integer>();
		HashSet<Integer> generate_set = new HashSet<Integer>();
		for(int i=1; i<10001; i++){
			int sum = i;
			all_set.add(i);
			String num = String.valueOf(i);
			for(int j=0; j<num.length(); j++){
				sum += Integer.parseInt(String.valueOf(num.charAt(j)));
			}
			generate_set.add(sum);	
		}
		all_set.removeAll(generate_set);
		
		Iterator hi = all_set.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
	}
}
