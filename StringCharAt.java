package algorizum;

import java.util.Scanner;

//文字列が入力されるので、1文字目を出力
public class StringCharAt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
//		System.out.println(S.charAt(0));
		System.out.println(S.substring(0,1));
		sc.close();
	}

}
