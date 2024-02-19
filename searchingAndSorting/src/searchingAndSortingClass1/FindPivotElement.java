package searchingAndSortingClass1;

public class FindPivotElement {

	public static void main(String[] args) {
		
		
		int arr[]= {2,1,-1};
		int e=arr.length;
		int s=0;
		int mid=s+(e-s)/2;
		
		while(s<=e) {
			if(arr[mid]>arr[mid+1]) {
				System.out.println(arr[mid]);
				break;
			}
			if(arr[mid]<arr[mid-1]) {
				System.out.println(arr[mid-1]);
				break;
			}
			if(arr[mid]>s) {
				s=mid+1;
			}else {
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		
		
//		addition note in 1st two condition sometimes its break in arrayoutofbound exception so for cover this type of things we add some condition to
//		if(mid+1v < arr.length and normal condtion) {
//			if(mid-1>	0)
//		}

	}

}
