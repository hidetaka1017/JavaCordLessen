package algorizum;

import java.util.Scanner;

public class StringOutput1 {

//	文字列が入力されるので、それらの文字を、1文字ずつ出力
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] array = S.split("");
		for (String str : array) {
			System.out.println(str);
		}
		
		sc.close();
	}
}
