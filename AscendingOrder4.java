package algorizum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//1行目に行数を表す整数 n、続く n 行の各行で「文字」と「整数」の組が空白区切りで入力されます。
//n 個の組について、「文字」の値が同じ組同士の数値を足しあわせてまとめ、まとめた数値の降順で、文字とまとめた数値の組を出力してください。
//この際、まとめた数値は重複しません。
public class AscendingOrder4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    Map<Character, Integer> map = new HashMap<>();
	    
	    for (int i=0; i<n; i++) {
	      char c = sc.next().charAt(0);
	      int v = sc.nextInt();
	      if (map.containsKey(c))
	        map.put(c, map.get(c) + v);
	      else
	        map.put(c, v);
	    }

	    List<Integer> ll = new ArrayList<>(map.values());
	    Collections.sort(ll);
	    Collections.reverse(ll);
	    
	    for (int v : ll)
	      for (Character c : map.keySet())
	        if (map.get(c) == v)
	          System.out.println(c + " " + v);
		
		sc.close();
	}

}
