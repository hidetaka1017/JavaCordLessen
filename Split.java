package algorizum;

import java.util.Scanner;

//文字列がスペース区切りで2つ入力されるので、スペースで分割し、2行で出力
public class Split {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String[] array = S.split(" ");
		for (String str : array) {
			System.out.println(str);
		}
		sc.close();
	}
}
