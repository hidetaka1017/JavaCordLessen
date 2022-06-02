package algorizum;

import java.util.Scanner;

public class CharIntSpace {

//	1行目に行数を表す整数 n、続く n 行で m 個の「文字」と「整数」の組が空白区切りで入力されます。
//	n 個の整数だけをそのまま順に出力してください。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.next();
			System.out.println(sc.nextInt());
		}
		sc.close();
	}
}
