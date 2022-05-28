package algorizum;

import java.util.Scanner;

//文字列の出力
public class StringOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < N; i++) {
			System.out.print(sc.nextLine());
			System.out.print(System.lineSeparator());
		}
	}
}
