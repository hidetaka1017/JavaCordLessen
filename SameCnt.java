package algorizum;

import java.util.HashMap;
import java.util.Map.Entry;

//指定された配列（リスト）の定義の中で、同じ要素の数をカウントして、その数を出力してください。
public class SameCnt {

	public static void main(String[] args) {
		String array[] = {"HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO"};
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        
        for (String pattern: array) {
            if (count.get(pattern) != null) {
                count.put(pattern, count.get(pattern) + 1);
            } else {
                count.put(pattern, 1);
            }
        }

        for (Entry <String, Integer> element: count.entrySet()) {
            if (element.getValue() != 1) {
                System.out.println(element.getValue());
            }
        }
		
		
//		String[] array = new String[] {"HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO"};
//		Set set = new HashSet();
//		int cnt = 0;
//		for (String duplicateCheck : array) {
//			if (!set.add(duplicateCheck)) {
//				cnt++;
//			}
//		}
//		System.out.println(++cnt);
	}

}
