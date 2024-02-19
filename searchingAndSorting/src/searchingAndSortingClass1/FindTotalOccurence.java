package searchingAndSortingClass1;

public class FindTotalOccurence {

	public static void main(String[] args) {
		
		int[] values= {2,2,2,2,2,2,2,5,7};
		int target = 2;
		int s=0;
		int e=values.length;
		int mid=s+(e-s)/2;
		int first = -1;
		int last = -1;
		
		//first occurence
		while(s<=e) {
			if(target == values[mid]) {
				first=mid;
				e=mid-1;
				
			}else if(target < values[mid]) {
				e=mid-1;
				
			}else if(target > values[mid]) {
				s=mid+1;
			}
			mid=s+(e-s)/2;
		}
		
		
		//last occurence
		s=0;
		e=values.length;
		mid=s+(e-s)/2;
		while(s<=e) {
			if(target == values[mid]) {
				last=mid;
				s=mid+1;
			}else if(target > values[mid]) {
				s=mid+1;
			}else {
				e=mid-1;
			}
			mid=s+(e-s)/2;
		}
		System.out.println(first+"    "+last);
		System.out.println(last-first+1);
	}

}
