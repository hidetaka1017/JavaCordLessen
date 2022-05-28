package algorizum;

public class ArrayAdd {

//	配列（リスト）データの足し合わせ 5以上の数のみ
	public static void main(String[] args) {
		int[] array = new int[] {4, 0, 5, -1, 3, 10, 6, -8};
		int total = 0;
		for (int N : array) {
			if (5 <= N) {
				total += N;
			}
		}
		System.out.print(total);
	}

}
