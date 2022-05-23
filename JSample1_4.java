package algorizum;

import java.util.Scanner;

//入力した値を半角空白で区切った場合、個別に出力するクラス
public class JSample1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("趣味を入力してください");
		
		String hobby = scanner.nextLine();
		String[] tokens = hobby.split("\\s+");
		for (int i = 0; i < tokens.length; i++) {
			System.out.println("[" + i + "]" + tokens[i]);
		}
	}
}
