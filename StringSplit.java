package algorizum;

import java.util.Scanner;

//文字列の分割
public class StringSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		String[] array = S.split(" ");
		for (String str : array) {
			System.out.print(str);
			System.out.print(System.lineSeparator());
		}
	}

}
