package String;

public class ReverseOnlyLetters917 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "z<*zj";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		int j = s.length()-1;
		int i = 0;
		while (i < j) {
			char ic = sb.charAt(i);
			char jc = sb.charAt(j);
			int alphaNum = (int) sb.charAt(i);
			int alphaNumj = (int) sb.charAt(j);
			if (alphaNum >= 65 && alphaNum <= 90 || alphaNum >= 97 && alphaNum <= 122) {
				if (alphaNumj >= 65 &&alphaNumj <= 90 || alphaNumj >= 97 && alphaNumj <= 122) {
					sb.setCharAt(i, jc);
					sb.setCharAt(j, ic);
					i++;
					j--;
				} else {
					j--;
				}
			} else {
				i++;
			}
		}
		System.out.println(sb);

	}

}
