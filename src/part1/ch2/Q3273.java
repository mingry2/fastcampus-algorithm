package part1.ch2;

import java.util.Scanner;

//두 수의 합
public class Q3273 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int X = sc.nextInt();

		boolean[] exist = new boolean[1000001];
		for (int i = 0; i < N; i++) {
			exist[a[i]] = true;
		}

		int ans = 0;
		for (int i = 1; i <= (X - 1) / 2; i++) {
			if (i <= 1000000 && X - i <= 1000000) {
				ans += (exist[i] && exist[X - i] ? 1 : 0);
			}
		}
//		for (int i = 0; i < N; i++) {
//			int pairVale = X - a[i];
//			if (0 <= pairVale && pairVale <= 1000000) {
//				ans += exist[pairVale] ? 1 : 0;
//			}
//		}
//		System.out.println(ans / 2);
		System.out.println(ans);
	}

}
