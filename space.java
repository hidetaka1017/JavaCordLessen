package algorizum;

import java.util.Scanner;

//スペース区切りで2つの整数が入力されるので、その区間の整数を全て表示。
public class space {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		for (int i = N; i <= M; i++) {
			System.out.println(i);
		}
		sc.close();		
	}

}
