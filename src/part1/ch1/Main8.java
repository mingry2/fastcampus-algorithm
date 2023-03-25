package part1.ch1;

import java.util.Scanner;

//[13223] 소금 폭탄
public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] cur = sc.next().split(":"); //23:59:59 => ["23","59","59"]
		String[] drop = sc.next().split(":");

		//Integer.parseInt() 를 하면 ()안에 있는걸 숫자로 바꿔준다
		//substring(시작인덱스, 종료인덱스(포함x))
		int cur_h = Integer.parseInt(cur[0]);
		int cur_m = Integer.parseInt(cur[1]);
		int cur_s = Integer.parseInt(cur[2]);

		int drop_h = Integer.parseInt(drop[0]);
		int drop_m = Integer.parseInt(drop[1]);
		int drop_s = Integer.parseInt(drop[2]);

		//시간, 분, 초 단위가있으면 제일 작은 단위로 통합해서 풀이
		int cur_second = cur_h * 60 * 60 + cur_m * 60 + cur_s; //초단위를 구할수있음
		int drop_second = drop_h * 60 * 60 + drop_m * 60 + drop_s;
		int gap_second = drop_second - cur_second;
		if (gap_second <= 0) gap_second += 24 * 60 * 60;


		int gap_h = gap_second / (60 * 60); //1시간 = 3600초, 0~3599 => 0시간 , 3600~7199 => 1시간, 나눈 몫
		int gap_m = (gap_second % 3600) / 60; //3600을 나눈 나머지는 분,초 단위만 남아 거기에 60초를 나눈 몫이 분이됨
		int gap_s = gap_second % 60; //101 => 01:41 101을 60초로 나눈 나머지가 초임


		//format에 맞춰서 출력
		String ans = String.format("%02d:%02d:%02d", gap_h, gap_m, gap_s);

		System.out.println(ans);

	}

}
