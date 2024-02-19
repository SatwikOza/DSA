package recursion;

public class MaxSUmOfNonAdjesentElement {

	public static void main(String[] args) {

		//SAME AS HOUSE ROBBERLY
		
		int[] arr= {2,1,4,9};
		int i=0;
		int[] max = new int[]{Integer.MIN_VALUE};
		int sum=0;
		solve(arr,i,sum,max);
		System.out.println(max[0]);

	}

	private static void solve(int[] arr, int i,int sum, int[] max) {

		if(i>=arr.length) {
			max[0]=Integer.max(max[0], sum);
			return;
		}
		solve(arr, i+2,sum+arr[i], max);
		
		
		solve(arr, i+1,sum, max);
	}

}
