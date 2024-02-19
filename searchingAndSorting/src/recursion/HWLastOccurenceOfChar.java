package recursion;

public class HWLastOccurenceOfChar {

	public static void main(String[] args) {

		String s="asdfgha";
		char find='h';
		int i=0;
		int[] last=new int[]{Integer.MIN_VALUE};
		//LEFT TO RIGHT
		int ans=solve(s,find,i,last);
		System.out.println(ans);
		//RIGHT TO LEFT
		int[] lastt=new int[]{Integer.MIN_VALUE};
		solvee(s,find,s.length()-1,lastt);
		System.out.println(lastt[0]);
	}
	
private static void solvee(String s, char find,int i,int[] last) {
		
		if(i<0) {
			return;
		}
		if(s.charAt(i)==find) {
			last[0]=i;
			return;
		}
		solvee(s, find, i-1,last);
		
	}

	private static int solve(String s, char find,int i,int[] last) {
		
		if(i>=s.length()) {
			return 0;
		}
		if(s.charAt(i)==find) {
			last[0] = Integer.max(last[0],i);
		}
		solve(s, find, i+1, last);
		
		return last[0];
	}

}
