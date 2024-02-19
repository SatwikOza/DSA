package searchingAndSortingClass1;

public class SquareRootUsingBinarySearch {

	public static void main(String[] args) {
		
		int n=7;
		int ans=squarRootAnd(n);		
		System.out.println(ans);
	}

	private static int squarRootAnd(int n) {

		int e = n;
		int s = 0;
		int mid = s + (e - s) / 2;
		int target=n;
		int storeVal=-1;
		while(s<=e) {
			if(mid*mid==target) {
				return mid;
			}
			if(mid*mid>target) {
				e=mid-1;
			}
			if(mid*mid<target) {
				storeVal=mid;
				s=mid+1;
			}
			mid = s + (e - s) / 2;
		}
		return storeVal;

		
	}

}
