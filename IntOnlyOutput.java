package algorizum;

import java.util.Scanner;

//1行目に行数を表す整数 n、続く n 行で n 個の「文字」と「整数」の組が空白区切りで入力されます。
//n 個の整数だけをそのまま順に出力してください。
public class IntOnlyOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < times; i++) {
			System.out.println(sc.nextLine().split(" ")[1]);
		}
		sc.close();
	}
}
