package algorizum;

import java.util.Scanner;

public class NandN1 {

//	文字列 s が入力されるので、n 文字目と n + 1 文字目を出力。 n + 1 文字目がない場合は何も出力
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		String[] array = S.split("");
		if (N < S.length()) {
			String str = array[N - 1] + " " + array[N];
			System.out.println(str);
		}
		
		sc.close();
	}
}
