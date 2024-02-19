package searchingAndSortingClass1;

public class FindElementInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://leetcode.com/problems/search-in-rotated-sorted-array/description/

		int arr[] = { 1,3 };
		int e = arr.length;
		int s = 0;
		int mid = s + (e - s) / 2;
		int target=1;
		
		while(s<=e){
			if(mid+1<e && arr[mid]>arr[mid+1] && arr[mid+1]==target){
                System.out.println(mid+1);
            }
            if(arr[mid]==target){
            	 System.out.println(mid);
            }
            if(arr[mid]<s){
                e=arr[mid];
            }
            else{
                s=arr[mid];
            }
            mid=s+(e-s)/2;
        }
		 System.out.println(-1);

	}

}
