package searchingAndSortingClass1;

public class FindLastOccurenceOfAnElement {

	public static void main(String[] args) {

		int[] values= {2,2,5,7};
		int target = 2;
		int s=0;
		int e=values.length;
		int mid=s+(e-s)/2;
		int ans = -1;
		
		while(s<=e) {
			if(target == values[mid]) {
				ans=mid;
				s=mid+1;
			}else if(target > values[mid]) {
				s=mid+1;
			}else if(target < values[mid]){
				e=mid-1;
			}
			mid=s+(e-s)/2;
			
		}
		System.out.println(ans);
		
	}

}
