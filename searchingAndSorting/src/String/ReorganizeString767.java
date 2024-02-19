package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReorganizeString767 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aab";
//		Character[] c = new Character[s.length()];
//		
//		Map<Character, Integer> hash = new HashMap<>();
//		for (int i = 0; i < s.length(); i++) {
//			if (!hash.containsKey(s.charAt(i))) {
//				hash.put(s.charAt(i), 1);
//			} else {
//				int val = hash.get(s.charAt(i));
//				hash.put(s.charAt(i), val + 1);
//			}
//		}
//		System.out.println(hash.values());
//		List<Integer> list = new ArrayList<>();
//		list.addAll(hash.values());
//		Collections.sort(list);
//		char most = ' ';
//		int val = -1;
//		for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
//			if (val < entry.getValue()) {
//				most = entry.getKey();
//			}
//		}
//		System.out.println(most);
//
//		int mostVal = -1;
//		char keyVal;
//		int setSb = -2;
//		for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
//			if (entry.getValue() > mostVal)
//				mostVal = entry.getValue();
//			if (mostVal > (s.length() + 1) / 2) {
//				System.out.println("fsdfsd");
//			}
//		}
//		
//		String newStr="";
//		for(int i=hash.size();i<hash.size();i++) {
//			
//		}
//		
//		
//		
//		
//		
//		for (Map.Entry<Character, Integer> entry : hash.entrySet()) {
//			if (entry.getValue() > mostVal)
//				mostVal = entry.getValue();
//			keyVal = entry.getKey();
//			for (int i = 0; i < entry.getValue(); i++) {
//				if (setSb >= s.length() - 1) {
//					setSb = -1;
//				}
//				setSb = setSb + 2;
//				c[setSb] = keyVal;
//				System.out.println(Arrays.toString(c));
//			}
//		}
//
//		String ss = Arrays.toString(c);
//		System.out.println(ss);
//		System.out.println(Arrays.toString(c));
		int setSb = -2;
		char[] c = new char[s.length()];
        // Sort the character array in ascending order
        Map<Character, Integer> hash = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (!hash.containsKey(s.charAt(i))) {
				hash.put(s.charAt(i), 1);
			} else {
				int val = hash.get(s.charAt(i));
				hash.put(s.charAt(i), val + 1);
			}
		}
		
		
		String key=findMax(hash,setSb,s,c);
		
		System.out.println(key);
		
		
		
		
//        for(int i=0;i<charArray.length;i++) {
//        	setSb = setSb + 2;
//        	if (setSb > s.length() - 1) {
//        		if(charArray[i] ==c[0]) {
//        			 System.out.println("bakvas"); 
//        		}
//				setSb = 1;
//			}
////			setSb = setSb + 2;
//			c[setSb] = charArray[i];
//			System.out.println(Arrays.toString(c));
//        }
//        System.out.println(new String(c));
        // Create a new string from the sorted array
//       String newStr= new String(charArray);
       
	}
	private static String findMax(Map<Character,Integer> hash,int setSb,String s,char[] c) {
		int maxLen=-1;
		char key=' ' ;
		if(hash.isEmpty()) {
			return null;
		}
		for(Map.Entry<Character,Integer> entry : hash.entrySet()) {
			if(maxLen<entry.getValue()) {
				maxLen=entry.getValue();
				key=entry.getKey();
			}
//			if(maxLen == -1) {
//				return new String(c);
//			}
		}
		if (maxLen > (s.length() +1)/ 2) {
    			 return "bakvas"; 
		}
		hash.remove(key);
		for(int i=0;i<maxLen;i++) {
			setSb = setSb + 2;
        	if (setSb > s.length() - 1) {
        		if(key ==c[0]) {
        			 return ""; 
        		}
				setSb = 1;
			}
//			setSb = setSb + 2;
			c[setSb] = key;
//			System.out.println(Arrays.toString(c));
        }
//        System.out.println(new String(c));
        findMax(hash,setSb,s,c);
		
        return new String(c);
		
		
	}

}
