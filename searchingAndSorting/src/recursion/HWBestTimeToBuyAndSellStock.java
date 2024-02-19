package recursion;

public class HWBestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		int[] max = new int[] { Integer.MIN_VALUE };
		int[] min = new int[] { Integer.MAX_VALUE };
		int i = 0;
		int[] prices = { 7, 1, 5, 3, 6, 4 };
//		bestTimeToBuy(prices, max, i);
		withoutForLoop(prices,max,min,i);
		if (max[0] <= 0) {
			System.out.println(0);
		} else {
			System.out.println(max[0]);
		}

	}

	//alternative
	private static void withoutForLoop(int[] prices, int[] max, int[] min, int i) {

		//BASE CASE
		if(i>=prices.length)
			return;
		//CONDITION
		if(prices[i] < min[0]) {
			min[0]=prices[i];
		}
		int todaysProfit  =prices[i] -min[0];
		if(todaysProfit >max[0])
			max[0]=todaysProfit;
		
		//RE CALL
		withoutForLoop(prices, max, min, i+1);
	}

	private static void bestTimeToBuy(int[] p, int[] arr, int i) {

		if (i + 1 >= p.length) {
			return;
		}
		for (int j = i + 1; j < p.length; j++) {
			int sum = p[j] - p[i];
			if (arr[0] < sum) {
				arr[0] = sum;
			}
		}

		bestTimeToBuy(p, arr, i + 1);

	}

}
