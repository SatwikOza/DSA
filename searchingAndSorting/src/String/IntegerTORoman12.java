package String;

public class IntegerTORoman12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] integer = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String ans = "";
		while (num > 0) {
			for (int i = 0; i < roman.length; i++) {
				if (num >= integer[i]) {
					ans += roman[i];
					num -= integer[i];
					break;
				}

			}
		}
		System.out.println(ans);

	}

}
