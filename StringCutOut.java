package algorizum;

import java.util.Scanner;

//スペース区切りの2つの整数と、文字列が入力されるので、2つの整数の範囲の部分文字列を出力
public class StringCutOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		String str = S.substring(N - 1, M);
		System.out.println(str);
		sc.close();
	}
}
