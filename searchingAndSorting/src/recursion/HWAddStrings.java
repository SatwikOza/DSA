package recursion;

public class HWAddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 = "1";
		String num2 = "9";
		int carrey = 0;
		StringBuilder sb = new StringBuilder();
		solve(num1, num2, carrey, num1.length() - 1, num2.length() - 1, sb);
		System.out.println(sb.reverse().toString());

	}

	private static void solve(String a, String b, int c, int i, int j, StringBuilder s) {

		int aa = 0;
		int bb = 0;
		
		if(i<0 && j<0) {
			if(c!=0) {
				s.append(c);
			}
			return;
		}
		
		if (i < 0) {
			aa=0;
			i=0;
		} else {
			aa = a.charAt(i)-'0';
		}
		if (j < 0) {
			bb=0;
			j=0;
		} else {
			bb = b.charAt(j)-'0';
		}
		
		
		int ans = 0;
		if (c > 0) {
			ans = aa + bb + c;
			c=0;
		} else {
			ans = aa + bb;
		}

		if (ans - 10 >= 0) {
			c = 1;
			s.append(ans - 10);
		} else {
			s.append(ans);
			// s[0] = ans;
		}
		solve(a, b, c, i - 1, j - 1, s);

	}

}
