package recursion;

public class HWRemoveAllOccurenceOfASubString {

	public static void main(String[] args) {
		String s = "abfnasabpasbvbabab";
		String part = "ab";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		remove(sb, part);
		System.out.println(sb.toString());
	}

	private static void remove(StringBuilder sb, String p) {
		if (!(sb.indexOf(p) >= 0)) {
			return;
		}
		int index = sb.indexOf(p);

		sb.delete(index, index + p.length());
		remove(sb, p);

	}
}
