package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backJoon_11654 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		byte[] result = read.readLine().getBytes();
		read.close();
		for(byte r : result){
			System.out.println(r);
		}
	}
}
