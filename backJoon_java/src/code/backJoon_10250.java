package code;

import java.util.Scanner;

/**
 * 백준 10250번 ACM 호텔
 * @author lyj
 *
 */
public class backJoon_10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//테스트 개수 
		int t = Integer.parseInt(scan.nextLine());
		for(int i=0; i<t; i++){
			String[] data = scan.nextLine().split(" ");
			int h = Integer.parseInt(data[0]); // 층 수
			int w = Integer.parseInt(data[1]); // 방 수
			int n = Integer.parseInt(data[2]); // 몇번째 손님
			
			int floor = 0;
			int room = 0;
			int cnt = 0;
			
			for(int j=1;j<=w;j++){
				if(cnt==n) break;
				room=j;
				for(int k=1; k<=h;k++){
					if(cnt==n) break;
					cnt ++;
					floor=k;
					
				}
			}

			String result = floor + (room<10 ? "0":"") + room;
			System.out.println(result);

		}
		scan.close();

	}

}
