package algorizum;

import java.util.Scanner;

//スペース区切りの2つの整数と、文字列が入力される。2つの整数の範囲の部分文字列を、大文字にして出力
public class SubstrUpper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		String Str = S.substring(0,N - 1) 
				+ S.substring(N - 1,M).toUpperCase() + S.substring(M);
		System.out.println(Str);
		
		sc.close();
	}
}
