package String;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "badc";
		String t = "baba";
		t.
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		if (s.length() != t.length()) {
			System.out.println(false);
		} else {
			for (int i = 0; i < s.length(); i++) {
//				if (map.containsKey(s.charAt(i)) || map.containsKey(t.charAt(i))) {
//					if (t.charAt(i) != map.get(s.charAt(i)) || s.charAt(i) != map.get(t.charAt(i))) {
//						System.out.println(false);
//					}
//				} else {
//					map.put(s.charAt(i), t.charAt(i));
//					map.put(t.charAt(i), s.charAt(i));
//				}
				if (map.containsKey(s.charAt(i))) {
					if (map.get(s.charAt(i)) != t.charAt(i)) {
						System.out.println(false);
						
					}
				}
//				if(map.containsKey(t.charAt(i))) {
//					if(map.get(t.charAt(i)) != s.charAt(i)) {
//						System.out.println(false);
//					}
//				}
				if (!map.containsKey(s.charAt(i))) {
					if (s.charAt(i) != t.charAt(i)) {
						for(HashMap.Entry<Character, Character> entry : map.entrySet()) {
							if(entry.getValue() == t.charAt(i)) {
								System.err.println(false);
							}
						}
						map.put(s.charAt(i), t.charAt(i));
					}
				}
//				if(!map.containsKey(t.charAt(i))) {
//					map.put(t.charAt(i), s.charAt(i));
//				}
			}
			System.out.println(true);
		}

	}

}
