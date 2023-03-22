package part1.ch1;

import java.util.Scanner;

//[1543] 문서 검색 - .indexof(찾을단어, 찾고자하는 파일의 시작 idex)
public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제에서 주어진 단어가 공백도 포함되어있기 때문에 nextLine()으로 해야함
		String doc = sc.nextLine(); //찾을 파일들
		String word = sc.nextLine(); // 파일들 중에서 찾을 단어

		int count = 0;
		int start_idx = 0; //찾을 파일의 시작 index
		while (true) {
			//start_idx 부터 찾게 됐을때
			//존재하지 않으면 -1
			int idx = doc.indexOf(word, start_idx);
			if (idx < 0) break;
			count++; //0보다 크다면 존재한다는것
			start_idx = idx + word.length();

		}
		System.out.println(count);
	}

}
