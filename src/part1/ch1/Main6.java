package part1.ch1;

import java.util.Scanner;

//[1543] 문서 검색 - .replace(내가찾는단어, 바꿀단어) 내가원하는 string을 찾아서 내가 원하는 string으로 바꾸는것
public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제에서 주어진 단어가 공백도 포함되어있기 때문에 nextLine()으로 해야함
		String doc = sc.nextLine(); //찾을 파일들
		String word = sc.nextLine(); // 파일들 중에서 찾을 단어

		int doc_length = doc.length();
		int word_length = word.length();
		int replaced_length = doc.replace(word, "").length();
		int count = (doc_length - replaced_length) / word_length;

		System.out.println(count);
	}

}
