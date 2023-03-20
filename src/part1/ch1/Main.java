package part1.ch1;

import java.util.Scanner;

//[2744] 대소문자 바꾸기
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		//str = "WrongAnswer"
//		String ans = ""; //매번 + 연산 시 인스턴스가 생성되어 메모리 낭비
		char[] ans = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				ans[i] = (char)('a' + ch - 'A'); //대문자 -> 소문자
			} else {
				ans[i] = (char)('A' + ch - 'a'); //소문자 -> 대문자
			}
		}
		System.out.println(ans);
	}
}
