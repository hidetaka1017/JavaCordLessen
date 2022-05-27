package algorizum;

//配列（リスト）要素の合計
public class arrangement {

	public static void main(String[] args) {
		int[] array = new int[] {1, 3, 5, 6, 3, 2, 5, 23, 2};
		int total = 0;
		for (int N : array) {
			total += N;
		}
		System.out.print(total);
	}

}
