package recursion;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int n=9;
		//NORMAL WAY
		int s=0;
		int e=arr.length;
		while(s<=e) {
			int mid=(s+e)/2;
			if(arr[mid] == n) {
				System.out.println(true);
			}
			if(arr[mid] < n) {
				s=mid+1;
			}else {
				e=mid-1;
			}
		}
		
		//USING RECURSION
		int s1=0;
		int e1=arr.length;
		binarySearch(arr,s1,e1,n);
		
	}
	private static void binarySearch(int[] arr,int s,int e,int n) {
		
		if(s>e) {
			System.out.println(false);
			return;
		}
		int mid=(s+e)/2;
		if(arr[mid] == n) {
			System.out.println(true);
			return;
		}
		if(arr[mid] < n) {
			s=mid+1;
		}else {
			e=mid-1;
		}
		binarySearch(arr, s, e, n);
		
		
	}

}
