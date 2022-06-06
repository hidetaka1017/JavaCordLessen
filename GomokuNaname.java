package algorizum;

import java.util.Scanner;

//5行5列の五目並べの盤面が与えられます。
//盤面の各マスには、"O"か"X"か"."が書かれています。
//"O"と"X"は、それぞれプレイヤーの記号を表します。
//同じ記号が斜めに連続で5つ並んでいれば、その記号のプレイヤーが勝者となります。
//勝者の記号を1行で表示してください。
//勝者がいない場合は、引き分けとして、"D"を表示してください。
public class GomokuNaname {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[5][5];
        String result = "D";
        
//      入力値の格納
        for (int i = 0; i < 5; i++) {
        	board[i] = scanner.next().split("");
        }
        
        // /の判定
        String diagR = judgement(diagRightUp(board));
        if (!diagR.equals("D")) {
        	result = diagR;
        }
        
        // \の判定
        String diagL = judgement(diagLeftUp(board));
        if (!diagL.equals("D")) {
        	result = diagL;
        }
        System.out.println(result);
        scanner.close();
	}
	
	// /方向の対角線の並びをStirngで返すメリット
	static String diagRightUp(String[][] board) {
		String line = "";
		for (int i = 0; i < 5; i++) {
			line += board[i][-(i - 4)];
		}
		return line;
	}
	
	// \方向の対角線の並びをStringで返すメソッド
	static String diagLeftUp(String[][] board) {
		String line = "";
		for (int i = 0; i < 5; i++) {
			line += board[i][i];
		}
		return line;
	}
	
	//引数に与えられた並びの勝者を"0","X","D"で返すメソッド
	static String judgement(String line) {
		if (line.equals("00000")) {
			return "0";
		} else if (line.equals("XXXXX")) {
			return "X";
		}
		return "D";
	}
}
