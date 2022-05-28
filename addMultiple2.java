package algorizum;

import java.util.Scanner;


public class addMultiple2 {

	//複数行の入力と出力 5以上の値を足す
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = sc.nextInt();
		}
		int total = 0;
		for (int M : array) {
			if (5 <= M) {
				total += M;
			}
		}
		System.out.print(total);
		sc.close();
	}
	

}
