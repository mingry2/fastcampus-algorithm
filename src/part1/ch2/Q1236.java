package part1.ch2;

import java.io.IOException;
import java.util.Scanner;

//성 지키기
public class Q1236 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		char[][] map = new char[N][M];
		for (int i = 0; i < N; i++) {
			map[i] = sc.next().toCharArray();
		}

		// 1. 각 행/열에 대해 경비원이 있는지

		boolean[] existRow = new boolean[N];
		boolean[] existCol = new boolean[M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'X') {
					existRow[i] = true;
					existCol[j] = true;
				}
			}
		}

		int needRowCount = N;
		int needColCount = M;

		for (int i = 0; i < N; i++) {
			if (existRow[i]) needRowCount--;
		}
		for (int i = 0; i < M; i++) {
			if (existCol[i]) needColCount--;
		}

		// row의 경비원 존재 여부 확인
//		int existRowCount = 0;
//		for (int r = 0; r < N; r++) {
//			boolean exist = false;
//			for (int c = 0; c < M; c++) {
//				if (map[r][c] == 'X') {
//					exist = true;
//					break;
//				}
//			}
//			if (exist) existRowCount++;
//		}
//
//		// col의 경비원 존재 여부 확인
//		int existColCount = 0;
//		for (int c = 0; c < M; c++) {
//			boolean exist = false;
//			for (int r = 0; r < N; r++) {
//				if (map[r][c] == 'X') {
//					exist = true;
//					break;
//				}
//			}
//			if (exist) existColCount++;
//		}
//
//		// 2. 보호받지 못하는 행/열의 개수를 구함
//		int needRowCount = N - existRowCount;
//		int needColCount = M - existColCount;

		// 3. 둘 중 큰 값을 출력
		System.out.println(Math.max(needRowCount, needColCount));

	}

}
