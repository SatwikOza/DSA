package searchingAndSortingClass1;

import java.util.ArrayList;
import java.util.List;

public class XClosestElement658 {
	
	public static List<Integer> findClosestElements(int[] arr, int k, int x) {
		List<Integer> list = new ArrayList<Integer>();
		if (arr.length - 1 == 0) {
			list.add(arr[0]);
			return list;
		} else {

			int h = arr.length - 1;
			int l = 0;
			int mid = (h + l) / 2;

			while (h - l >= k) {
				if (Math.abs(x - arr[l]) > Math.abs(arr[h] - x)) {
					l++;
				} else {
					h--;
				}
			}

			for (int i = l; i <= h; i++) {
				list.add(arr[i]);
			}

			return list;
		}

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		int[] arr = {1,1,1,10,10,10};
		list = findClosestElements(arr, 1,9);
		System.out.println(list);

	}

}
