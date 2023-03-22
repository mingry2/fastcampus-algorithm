package part1.ch1;

import java.util.Scanner;

//[1543] 문서 검색
public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제에서 주어진 단어가 공백도 포함되어있기 때문에 nextLine()으로 해야함
		String doc = sc.nextLine(); //찾을 파일들
		String word = sc.nextLine(); // 파일들 중에서 찾을 단어
		int count = 0;

		for (int i = 0; i < doc.length(); i++) {
			boolean match = true;
			/*
			이렇게 되면 런타임에러가 날수 있다.
			만약, doc: 10 / word: 4 /
			i + j = 8 + 2 => 10 doc의 length 보다 길게됨
			 */
			for (int j = 0; j < word.length(); j++) {
				if (i + j >= doc.length() ||
						doc.charAt(i + j) != word.charAt(j)) {
					match = false;
					break;
				}
//				if (doc.charAt(i + j) != word.charAt(j)) {
//					match = false;
//					break;
//				}
			}
			//중복이 되면 안됨 찾은 단어 그 다음 index부터 찾아야함
			if (match) {
				count++;
				i += word.length() - 1;
			}
		}
		System.out.println(count);
	}

}
