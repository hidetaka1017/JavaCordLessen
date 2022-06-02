package algorizum;

import java.util.Arrays;
import java.util.Scanner;

//1行目で整数 n が与えられ、2行目で n 個の整数が与えられます。
//n 個の整数を昇順に出力してください。
public class AscendingOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		for (int in : array) {
			System.out.println(in);
		}
		sc.close();
	}

}
