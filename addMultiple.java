package algorizum;

import java.util.Scanner;

//複数行の入力と出力 バージョン１
public class addMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		if (1 <= N & N <= 3000) {
			int[] mylist = new int[N];
			for (int i = 0; i < N; i++) {
				int M = sc.nextInt();
				mylist[i] = M;
			}
			if (1 <= mylist.length & mylist.length <= 100000) {
				for (int list : mylist) {
					System.out.print(list);
					System.out.print(System.lineSeparator());
				}
			}
		}			
	}

}
