package algorizum;

import java.util.Scanner;

//5行5列の五目並べの盤面が与えられます。
//盤面の各マスには、"O"か"X"か"."が書かれています。
//"O"と"X"は、それぞれプレイヤーの記号を表します。
//同じ記号が横に連続で5つ並んでいれば、その記号のプレイヤーが勝者となります。
//勝者の記号を1行で表示してください。
//勝者がいない場合は、引き分けとして、"D"を表示してください。
public class GomokuYoko {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		int i = 0;
		while (i < 5) {
			String input = sc.next();
			if (input.equals("OOOOO")) {
				result = "O";
			} else if (input.equals("XXXXX")) {
				result = "X";
			} 
			i++;
		}
		if (result == "") {
			result = "D";
		}
		System.out.println(result);
		sc.close();
	}
}
