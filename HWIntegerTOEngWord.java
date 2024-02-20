package recursion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Convert a non-negative integer num to its English words representation.



Example 1:

Input: num = 123
Output: "One Hundred Twenty Three"
Example 2:

Input: num = 12345
Output: "Twelve Thousand Three Hundred Forty Five"
Example 3:

Input: num = 1234567
Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"*/

public class HWIntegerTOEngWord {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 10, 20, 30,
				40, 50, 60, 70, 80, 90, 100, 1000, 1000000, 10000000, 1000000000);
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(11, "Eleven");
		map.put(12, "Twelve");
		map.put(13, "Thirteen");
		map.put(14, "Fourteen");
		map.put(15, "Fifteen");
		map.put(16, "Sixteen");
		map.put(17, "Seventeen");
		map.put(18, "Eighteen");
		map.put(19, "Nineteen");
		map.put(10, "Ten");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		map.put(40, "Forty");
		map.put(50, "Fifty");
		map.put(60, "Sixty");
		map.put(70, "Seventy");
		map.put(80, "Eighty");
		map.put(90, "Ninety");
		map.put(100, "Hundred");
		map.put(1000, "Thousand");
		map.put(1000000, "Million");
		map.put(10000000, "Ten Million");
		map.put(1000000000, "Billion");

//		System.out.println(list);
//
		int n = 100000;
//		int nLength = String.valueOf(n).length();
//		String name = "";
//		int value = 0;
//		for (int i : list) {
//			if (n >= i) {
//				value = i;
//			}
//		}
//		System.out.println(234567 / 1000000);
//		System.out.println(value);
		String ans = "";
//		One Million null Thousand Five Hundred Sixty Seven
//		One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven
		String anss = solve(n, map, list, ans);
		if (anss.charAt(anss.length() - 1) == ' ') {
			anss = anss.substring(0, anss.length() - 1);
		}
//			anss.trim();
		anss = anss.replaceAll("  ", " ");
		System.out.println(anss);
//		System.out.println(123 / 100);
//		System.out.println(123 % 100);

	}

	private static String solve(int n, Map<Integer, String> map, List<Integer> list, String ans) {

		if (n == 0) {
			return ans;
		}
		int value = 0;
		for (int i : list) {
			if (n >= i) {
				value = i;
			}
		}
		int one;
		if (n <= 19 && n != 10) {
			ans += map.get(n);
			return solve(0, map, list, ans);
		} else {
			if (value < 100) {
				one = n % value;
				if (one == 0) {
					ans += map.get(value) + " ";
				} else {
					ans += map.get(value) + " " + map.get(one);
				}
				return solve(0, map, list, ans);
			} else {
				if (n >= 100) {
					String a = solve(n / value, map, list, ans);
					String b = " " + map.get(value) + " ";
					String c = solve(n % value, map, list, ans);
					return a + b + c;
				}

			}
		}
		return "";

	}

}

//
//
//int value = 0;
//for (int i : list) {
//	String a = "";
//	if (n >= i) {
//		value = i;
//		if (n >= 100) {
//			a = solve(n / 100, map, list, ans);
//		}
//		String b = "";
//		b = map.get(i);
//		String c = "";
//		if (n % i != 0) {
//			c = solve(n % i, map, list, ans);
//		}
//		return a+b+c;
//
//	}
//}
//return "";
