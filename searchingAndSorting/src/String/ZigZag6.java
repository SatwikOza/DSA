package String;

import java.util.ArrayList;
import java.util.List;

public class ZigZag6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABCDEFGHI";
        int row = 3;

        List<List<Character>> result = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            result.add(new ArrayList<>());
        }
        System.out.println(result);

        int index = 0;
        boolean down = true;

        for (char c : s.toCharArray()) {
            result.get(index).add(c);
            
            if (down) {
                index++;
            } else {
                index--;
            }

            if (index == 0 || index == row - 1) {
                down = !down;
            }
        }
        String ans="";
        for (List<Character> list : result) {
        	for(int i=0;i<list.size();i++) {
        	ans+=list.get(i);
        	}
            System.out.println(list);
            System.out.println(ans);
        }
//        return ans;
	}
}
