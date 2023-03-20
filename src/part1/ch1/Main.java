package part1.ch1;

import java.util.Scanner;

//[1919] 애너그램 만들기
public class Main {
	//공통적인 기능을 뽑아 함수를 만듦
	public static int[] get_alphabet_count(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'a']++; //-'a'를 해주면 알파벳이 나옴
		}
		return count;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		//------------------------------------------- 카운트 배열 구현
		int[] a_count = get_alphabet_count(a); //count 배열(알파벳 갯수 26개)
		int[] b_count = get_alphabet_count(b);
//		int[] a_count = new int[26]; //count 배열(알파벳 갯수 26개)
//		int[] b_count = new int[26];
//		for (int i = 0; i < a.length(); i++) {
//			a_count[a.charAt(i) - 'a']++; //-'a'를 해주면 알파벳이 나옴
//		}
//		for (int i = 0; i < b.length(); i++) {
//			b_count[b.charAt(i) - 'a']++;
//		}

		//------------------------------------------- 차이나는 숫자가 제거해줘야하는 원소들
		int ans = 0;
		for (int i = 0; i < 26; i++) {
			//넘겨받는 인자의 절대값을 취하는 메서드 -> b가 a보다 크면 음수 나오지만 절대값이니 - 빼고 +=하게됨
			ans += Math.abs(a_count[i] - b_count[i]);
//			if (a_count[i] > b_count[i]) { //연산 시 음수가 나올 수 있으므로 이렇게 대소 비교를하는 것
//				ans += a_count[i] - b_count[i];
//			} else if (b_count[i] > a_count[i]) {
//				ans += b_count[i] - a_count[i];
//			}
		} System.out.println(ans);
	}
}
