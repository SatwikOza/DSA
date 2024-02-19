package recursion;

public class IntegerSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=45726;
		returnAllTheDigtis(a);
	}

	private static void returnAllTheDigtis(int a) {

		if(a==0) {
			return;
		}
		 
		int ans=a%10;
		
		returnAllTheDigtis(a/10);
		System.out.println(ans);
	}

}
