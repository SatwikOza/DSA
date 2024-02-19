package recursion;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 55, 6, 7, 8, 9 };
		print(arr, arr.length, 0);

		// FIND MAX NUMBER
		int max = Integer.MIN_VALUE;
		int val = maxVal(arr, arr.length, 0, max);
		System.out.println();
		System.out.println("Max Ans : "+val);
		
		// FIND MIN NUMBER
		int min=Integer.MAX_VALUE;
		int minAns=minVal(arr, arr.length,0,min);
		System.out.println("Min ans : "+minAns);
	}

	private static int minVal(int[] arr, int length, int i, int min) {
		
		if(i>= length) {
			return min;
		}
		if(min>arr[i]) {
			min=arr[i];
		}
		return minVal(arr, length, i+1, min); 
	}

	private static int maxVal(int[] arr, int length, int i, int max) {

		if (i >= length) {
//			System.out.println(max);
			return max;
		}

		if (max < arr[i]) {
			max = arr[i];
		}
		return maxVal(arr, length, i + 1, max);

	}

	private static void print(int[] arr, int length, int i) {

		if (i >= length) {
			return;
		}
		System.out.print("-" + arr[i]);
		print(arr, length, i + 1);

	}

}
