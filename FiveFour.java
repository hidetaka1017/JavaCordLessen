package algorizum;

import java.util.Scanner;

//入力値が5以上か4以下か
public class FiveFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (-200000 <= N & N <= 200000) {
			if (5 <= N) {
				System.out.print("high");
			} else {
				System.out.print("low");
			}
		}
		sc.close();
	}

}
