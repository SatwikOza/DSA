package recursion;

public class IncExcFindSumButMinTraverse {

	public static void main(String[] args) {

		
		int[] arr= {1,2,3};
		int sum=5;
		int[] store=null;
		int curSum=0;
		int ans=findTheMinTraverse(arr,sum);
		System.out.println(ans);
	}

	private static int findTheMinTraverse(int[] arr, int target) {

		if(target==0) {
			return 0;
		}
		if(target <0) {
			int min=Integer.MAX_VALUE;
			return min;
		}
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int ans=findTheMinTraverse(arr, target-arr[i]);
			if(ans!=Integer.MAX_VALUE) {
				min=Integer.min(ans+1, min);
			}
			
		}
		return min;
		
		
			
	}

}
