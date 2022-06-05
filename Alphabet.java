package algorizum;

import java.util.Scanner;


//1行目の英大文字 X から、2行目の英大文字 Y の範囲に3行目のアルファベット C が含まれていれば"true", そうでなければ"false"と出力してください。
//X が Y よりもアルファベット順で後ろになる場合(X = 'G', Y = 'F'のときなど)も"false"と出力してください。
public class Alphabet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char x = sc.next().charAt(0);
		char y = sc.next().charAt(0);
		char c = sc.next().charAt(0);
		System.out.println(x <= c && c <= y);
		
//		String s = sc.nextLine();
//		if (s.charAt(0) <= s.charAt(s.length() -1)) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		for (char c = s.charAt(0); c <= s.charAt(s.length()-1); c++) {
//			System.out.println(c);
//		}
		sc.close();
	}

}
