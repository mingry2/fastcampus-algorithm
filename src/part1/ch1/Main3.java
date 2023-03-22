package part1.ch1;

import java.util.Scanner;

//[1157] 단어 공부
public class Main3 {
	public static int[] getAlphabetCount(String str) {
		int[] count = new int[26];
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i) - 'A']++; //Uppercase 함수를 사용하여 모두 대문자로 통일시켰음
//			char ch = str.charAt(i);
//			if ('A' <= ch && ch <= 'Z') {
//				count[ch - 'A']++;
//			} else if ('a' <= ch & ch <= 'z') {
//				count[ch - 'a']++;
//			}
		} return count;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next().toUpperCase(); //대소문자 상관없이 받으면 되기 때문에 toUpperCase() 함수 사용
		int[] count = getAlphabetCount(str);
		//count에 카운트된 숫자확인
		for (int i = 0; i < 26; i++) {
			if (count[i] > 0) {
				System.out.println((char)('A' + i) + ": " + count[i]);
				/*
				Mississipi
				I: 4
				M: 1
				P: 1
				S: 4
				 */
			}
		}

		//최댓값 구하기
		int max_count = -1; //최댓값 갱신 시 문제 없는 -1로 설정
		char max_alphabet = '?'; //문제에서 최댓값을 가진 알파벳을 구하라라고 했기 때문에
		for (int i = 0; i < 26; i++) {
			if (count[i] > max_count) {
				max_count = count[i];
				max_alphabet = (char)('A' + i);
			} else if (count[i] == max_count) {
				max_alphabet = '?';
			}
		}
		System.out.println(max_alphabet);
	}

}
