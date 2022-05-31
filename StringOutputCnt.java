package algorizum;

import java.util.Scanner;

public class StringOutputCnt {

//	1行目で文字列 s、2行目で文字列 t が入力される。
//	s が t の中で何回出現するかカウントして出力。
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pattern = sc.nextLine();
		String str = sc.nextLine();
		
		int cnt = 0;
		for (int i = 0; i <= str.length() - pattern.length(); i++) {
			String s = str.substring(i, i + pattern.length());
			if (s.equals(pattern)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		sc.close();
	}
}
