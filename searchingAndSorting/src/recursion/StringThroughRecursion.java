package recursion;

import java.util.ArrayList;
import java.util.List;

public class StringThroughRecursion {

	public static void main(String[] args) {

		String str = "satwik prajapati";
		char find = 'a';
		int len = str.length();

		// IS FIND PRESENT OR NOT
		boolean ans = presentOrNot(str, find, len, 0);
		System.out.println("element present or not : " + ans);

		// FIND THE POSITION
		int ans1 = findThePosition(str, find, len, 0);
		System.out.println("position  : " + ans1);

		// FIND THE ALL POSITION
		findTheAllPosition(str, find, len, 0);

		// FIND THE ALL POSITION AND STORE
		List<Integer> list = new ArrayList();
		findTheAllPositionAndStore(str, find, len, 0, list);
		System.out.println("Stored val arr : " + list);
	}

	private static void findTheAllPositionAndStore(String str, char find, int len, int index, List<Integer> list) {
		if (index >= len) {
			return;
		}

		if (str.charAt(index) == find) {
			list.add(index);
		}

		findTheAllPositionAndStore(str, find, len, index + 1, list);

	}

	private static int findThePosition(String str, char find, int len, int index) {
		if (index >= len) {
			return 0;
		}

		if (str.charAt(index) == find) {
			return index;
		}

		return findThePosition(str, find, len, index + 1);
	}

	private static void findTheAllPosition(String str, char find, int len, int index) {
		if (index >= len) {
			return;
		}

		if (str.charAt(index) == find) {
			System.out.println("All position: " + index);
		}

		findTheAllPosition(str, find, len, index + 1);
	}

	private static boolean presentOrNot(String str, char find, int len, int index) {

		if (index >= len) {
			return false;
		}

		if (str.charAt(index) == find) {
			return true;
		}

		return presentOrNot(str, find, len, index + 1);
	}

}
