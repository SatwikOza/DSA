package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s={"eat","tea","tan","ate","nat","bat"};
		Map<String, List<String>> map=new HashMap<>();
		for(int i=0;i<s.length;i++) {
			char[] c=s[i].toCharArray();
			Arrays.sort(c);
			String str = new String(c);
			List<String> list=new ArrayList<>();
			if(map.containsKey(str)) {
				list.addAll(map.get(str));
				list.add(s[i]);
				map.put(str, 	list);
			}else {
				list.add(s[i]);
				map.put(str, list);
			}
		}
			List<List<String>> l=new ArrayList<>();
			l.addAll(map.values());
			return l;
		System.out.println(map.values());
	}

}
