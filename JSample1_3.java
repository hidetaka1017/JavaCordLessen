package algorizum;

import java.util.Scanner;

//入力した文章１行全て出力するクラス
public class JSample1_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("趣味を入力してください");
		
		String hobby = scanner.nextLine();
		System.out.println("趣味は" + hobby + "です");
		
	}

}
