package searchingAndSortingClass1;

public class LowerBoundInBS {
	
private static int BSLowerestBound(int[] arr2, int x) {
		
		
		int s=0;
		int e=arr2.length-1;
		int ans=-1;
		while(s<=e) {
			int mid = (s+e)/2;
			if(Math.abs(arr2[mid] - x) >= 0){
				ans=mid;
				return ans;
			}else if((arr2[mid] - x) < 0) {
				
				s=mid+1;
				//ans=arr2[mid];
			}else {
				e=mid-1;
				//ans=arr2[mid];
			}
		}
		return ans;
	}

public static void main(String[] args) {
	
	int[] arr = {1,2,3,4,6,7,8};
	int lowerBound=BSLowerestBound(arr,5);
	System.out.print(lowerBound);
	
	}

}
