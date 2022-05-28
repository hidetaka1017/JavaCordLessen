package algorizum;

import java.util.Scanner;

public class IntAdd {

//	整数の足し算 スペースで区切られた２つの整数を足す
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String S = sc.nextLine();
//		String[] array = S.split(" ");
//		int total = 0;
//		for (String str : array) {
//		   total += Integer.parseInt(str);
//		}
//		System.out.println(total);
		
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		
		while (scanner.hasNext()) {
			sum += scanner.nextInt();
		}
		System.out.println(sum);
		
		scanner.close();
	}
}
