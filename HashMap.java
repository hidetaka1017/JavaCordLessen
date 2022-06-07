package algorizum;

import java.util.LinkedHashMap;

//「ユーザー」と「ユーザーに対応する血液型」を連想配列（辞書）として定義して、それらのキーと値のペアを順に出力
public class HashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, String> user2blood = new LinkedHashMap<String, String>();
		user2blood.put("kyoko", "B");
		user2blood.put("Rio", "O");
		user2blood.put("Tsubame", "AB");
		user2blood.put("KurodaSensei", "A");
	    user2blood.put("NekoSensei", "A");
	    for (String user : user2blood.keySet()) {
	    	String blood = user2blood.get(user);
	    	System.out.println(user + " " + blood);
	    }
	}
}
