package algorizum;

import java.util.Scanner;

public class StringOutput12 {

//	文字列の１、２文字目を出力
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		String str = S.substring(0,1) + " " + S.substring(1,2);
		System.out.println(str);
		
		sc.close();
	}
}
