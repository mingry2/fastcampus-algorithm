package part1.ch2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//수 정렬하기3
public class Q10989 {
	public static void main(String[] args) throws IOException {
		// 이렇게 되면 '시간초과'
		// Scanner 가 많이 느림
//		Scanner sc = new Scanner(System.in);
//
//		int N = sc.nextInt();
//		int[] cnt = new int[10001];
//		for (int i = 0; i < N; i++) {
//			cnt[sc.nextInt()]++;
//		}
//
//		for (int i = 1; i <= 10000; i++) {
//			while(cnt[i]-- > 0) {
//				System.out.println(i);
//			}
//		}
		// 입력 값이 백만 단위 초과 되면 BufferedReader로 하는게 좋다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] cnt = new int[10001];
		for (int i = 0; i < N; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}

		for (int i = 0; i <= 10000; i++) {
			while (cnt[i]-- > 0) {
				bw.write(i + "\n");
			}
		}
		bw.flush();

	}

}
