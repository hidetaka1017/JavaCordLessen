package algorizum;

import java.util.Scanner;

public class IntGoukei5 {
	//5以上の整数の合計
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i < times; i++) {
			int num = scanner.nextInt();
			
			if (num >= 5){
				sum += num;
			}
		}
		System.out.println(sum);
		
		scanner.close();
	}

}
