package recursion;

public class ArraySortedOrNot {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,6};
		boolean ans=sortedOrNot(arr,0);
		System.out.println(ans);
 	}
	private static boolean sortedOrNot(int[] arr,int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i] >arr[i+1]) {
			return false;
		}
		return sortedOrNot(arr, i+1);
	}

}
