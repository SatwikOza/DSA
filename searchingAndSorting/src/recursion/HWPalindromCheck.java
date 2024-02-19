package recursion;

public class HWPalindromCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "RRsdgR";

		solve(s, 0, s.length() - 1);
	}

	private static void solve(String s, int i, int j) {

		if (i>=j) {
			System.out.println(true);
			return;
		} 
		if(s.charAt(i) != s.charAt(j)) {
			System.out.println(false);
			return;
		}
		solve(s, i+1, j-1);

	}

}
