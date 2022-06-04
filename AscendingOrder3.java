package algorizum;

import java.util.Arrays;
import java.util.Scanner;

//1行目で整数 n が与えられ、2行目で n 個の整数が与えられます。
//n 個の整数を昇順に出力してください。
public class AscendingOrder3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		int[] intArray = new int[times];
		for (int i = 0; i < times; i++) {
			intArray[i] = sc.nextInt();
		}
		Arrays.sort(intArray);
		for (int n : intArray) {
			System.out.println(n);
		}
		sc.close();
	}
}
