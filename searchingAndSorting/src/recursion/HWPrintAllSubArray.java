package recursion;

public class HWPrintAllSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		subArray(arr, 0, 0);

	}

	private static void subArray(int[] arr, int i, int j) {

		// BASE BASE
		if (j >= arr.length || i >= arr.length) {
			return;
		}
		for (int p = i; p <= j; p++) {
			System.out.print(arr[p]);
		}
		System.out.println();
		subArray(arr, i, j + 1);

		if (j == arr.length - 1) {
			subArray(arr, i + 1, i + 1);
		}
	}

}
