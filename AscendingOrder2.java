package algorizum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//1行目に行数を表す整数 n、続く n 行の各行で「文字」と「整数」の組が空白区切りで入力されます。
//n 個の組を、「整数」の値で昇順に並べ変え、「文字」を出力してください。
public class AscendingOrder2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		int index[] = new int[times];
		for (int i = 0; i < times; i++) {
			String input[] = sc.nextLine().split(" ");
			hmap.put(Integer.parseInt(input[1]), input[0]);
			index[i] = Integer.parseInt(input[1]);
		}
		Arrays.sort(index);
		
		for (int i : index) {
			System.out.println(hmap.get(i));
		}
		sc.close();
	}

}
