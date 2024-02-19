package String;

public class StringToInteger8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "-91283472332";
//		String a="-+";45 43
//		System.out.println(Integer.valueOf(a.charAt(1)));
		s.trim();
		int k=0;
		while(k<s.length()) {
			if(s.charAt(k) == ' ' && 48 <= Integer.valueOf(s.charAt(k+1)) && 57 >= Integer.valueOf(s.charAt(k+1))) {
				System.out.println(0);;
			}
			k++;
		}
//		System.out.println(Integer.valueOf(s.charAt(0)));
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
//			System.out.println(Integer.valueOf(s.charAt(i)));
			if (s.charAt(i) == '+' || s.charAt(i) == '-'
					|| 48 <= Integer.valueOf(s.charAt(i)) && 57 >= Integer.valueOf(s.charAt(i))) {
				if (ans.length() == 0) {
					ans += s.charAt(i);
				} else {
					ans += s.charAt(i);
				}
			} else {
				if (ans.length() > 0) {
					break;
				}
			}
		}
		
		if(Long.valueOf(ans)<min || Long.valueOf(ans)>max) {
			System.out.println(-1);
		}
		System.out.println(ans);
	}

}
