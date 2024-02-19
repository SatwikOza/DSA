package recursion;

public class HWReverseString {

	public static void main(String[] args) {

		String s = "abcdefg";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		int i = 0;
		int j = s.length() - 1;
		solve(sb, i, j);
		System.out.println(sb);
	}

	private static void solve(StringBuilder sb2, int i, int j) {

		if (i == j) {
			return;
		}
		char a = sb2.charAt(i);
		char b = sb2.charAt(j);
		sb2.setCharAt(i, b);
		sb2.setCharAt(j, a);
		solve(sb2, i + 1, j - 1);

	}

}
