package algorizum;

import java.util.Scanner;

//2つの整数の組がn個与えられるので、各組の計算結果を足し合わせたものを出力
//各組の計算結果は次の値。
//・2つの整数の組を足し合わせたもの
//・ただし、2つの整数が同じ値だった場合は、掛け合わせたもの
public class AdditionMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < times; i++) {
			long tmp[] = new long[2];
			tmp[0] = sc.nextInt();
			tmp[1] = sc.nextInt();
			
			if (tmp[0] != tmp[1]) {
				sum += (tmp[0] + tmp[1]);
			} else {
				sum += (tmp[0] * tmp[1]);
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
