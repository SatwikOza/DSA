package searchingAndSortingClass1;

public class BookAllocation {
	private static boolean possibleSollution(int[]A,int N, int M, int sol){
        int pageSum=0;
        int c=1;
        
        
        for(int i=0;i<N ;i++){
            if(A[i]>sol){
                return false;
            }
            if(pageSum+A[i] > sol){
                c++;
                pageSum=A[i];
                if(c>M){
                    return false;
                    
                }
            }
            else{
                pageSum += A[i];
            }
        }
        return true;
        
    }
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(M>N){
            return -1;
        }
        
        int totalPage=0;
        for(int i : A){
            totalPage += i;
        }
        if(M==1) {
        	return totalPage;
        }
        
        int end=totalPage;
        int start=0;
       
        int ans=-1;
        
        while(start<end){
            int mid = (start+end)/2;
            if(possibleSollution(A,N,M,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
	
}
	
	public static void main(String args[]) {
		
		 int A[] = {22,23,67};
	     int N=3;
	     int M=1;
	     
	     int ans=findPages(A,N,M);
	     System.out.println(ans);
		
		

}
}
