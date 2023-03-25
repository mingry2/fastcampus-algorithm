package part1.ch1;

import java.util.Scanner;

//[13223] 소금 폭탄
public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cur = sc.next();
		String drop = sc.next();

		/*
		방법1
		int cur_h = (cur.charAt(0) - '0') * 10 + cur.charAt(1) - '0';
		int cur_m = (cur.charAt(3) - '0') * 10 + cur.charAt(4) - '0';
		 */

		//Integer.parseInt() 를 하면 ()안에 있는걸 숫자로 바꿔준다
		//substring(시작인덱스, 종료인덱스(포함x))
		int cur_h = Integer.parseInt(cur.substring(0,2));
		int cur_m = Integer.parseInt(cur.substring(3,5));
		int cur_s = Integer.parseInt(cur.substring(6,8));

		int drop_h = Integer.parseInt(drop.substring(0,2));
		int drop_m = Integer.parseInt(drop.substring(3,5));
		int drop_s = Integer.parseInt(drop.substring(6,8));

//		System.out.println(cur_h);
//		System.out.println(cur_m);
//		System.out.println(cur_s);

		int gap_h = drop_h - cur_h;
		int gap_m = drop_m - cur_m;
		int gap_s = drop_s - cur_s;

		//음수일 경우 처리
		if (gap_s < 0) {
			gap_s += 60;
			gap_m--;
		}
		if (gap_m < 0) {
			gap_m += 60;
			gap_h--;
		}
		if (gap_h <= 0) {
			gap_h += 24;
		}

		String ans = "";

		if (gap_h < 10) ans += "0" + gap_h + ":";
		else ans += gap_h + ":";

		if (gap_m < 10) ans += "0" + gap_m + ":";
		else ans += gap_m + ":";

		if (gap_s < 10) ans += "0" + gap_s;
		else ans += gap_s;

		System.out.println(ans);

	}

}
