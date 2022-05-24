package algorizum;

import java.util.Scanner;

//入力した値から母音を取り除いてハンドルネームを作成するクラス
public class HandleName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        if (5 <= S.length() & S.length() <= 20){
        	String str = S.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "")
        	.replace("A", "").replace("E", "").replace("I", "").replace("O", "").replace("U", "").replace("u", "");
        	System.out.println(str);
        }
	}
}
