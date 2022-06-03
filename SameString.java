package algorizum;

import java.util.HashSet;
import java.util.Set;

public class SameString {

	public static void main(String[] args) {
		String[] array = new String[] {"HND", "NRT", "KIX", "NGO", "NGO"};
		Set set = new HashSet();
		for (String duplicateCheck : array) {
			if (!set.add(duplicateCheck)) {
				System.out.println("true");
			}
		}
	}

}
