package part1.ch2;

import java.util.Scanner;

//줄 세우기
public class Q10431 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();

		// == for (int p = 0; p < P; p++) 똑같은 것
		while (P-- > 0) { // P가 -- 되면서 0보다 큰 범위 동안
			int T = sc.nextInt(); // 테스트 케이스 번호
			int[] h = new int[20]; // 학생들이 저장되어있는 배열
			for (int i = 0; i < 20; i++) {
				h[i] = sc.nextInt();
			}

			int cnt = 0; // 뒤로 물러나는 횟수
			int[] sorted = new int[20]; // 학생들을 정렬 시킬 배열
			for (int i = 0; i < 20; i++) {
				// 1. 줄 서있는 학생 중에 자신보다 큰 학생을 찾는다.
				// 1-1. 찾지 못했다면, 줄의 가장 뒤에 선다.
				boolean find = false; // 나보다 큰 학생을 찾았는가?
				for (int j = 0; j < i; j++) {
					if (sorted[j] > h[i]) {
						// 2. 찾았다면, 그 학생의 앞에 선다.
						// 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
						find = true;
						for (int k = i - 1; k >= j; k--) {
							sorted[k + 1] = sorted[k];
							cnt++; // 한걸음 물러날때마다 cnt를 증가시켜줌
						}
						sorted[j] = h[i]; // 나보다 큰 학생을 찾고 그 앞에 서는것
						break;
					}
				}
				if (!find) sorted[i] = h[i]; // 나보다 큰 학생을 못 찾았다면 맨뒤에 선다.
			}
			System.out.println(T + " " + cnt);
		}
	}
}
