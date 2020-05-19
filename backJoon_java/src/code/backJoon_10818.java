package code;

import java.util.Arrays;
import java.util.Scanner;

public class backJoon_10818 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[n-1]);
		scan.close();
	}
}
