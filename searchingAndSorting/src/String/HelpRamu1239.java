package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HelpRamu1239 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s= {"dsa","ter"};
		
		Set<String> set=new HasehSet<>();
		for(String val:s) {
			for(int i=0;i<val.length();i++) {
				set.add(String.valueOf(val.charAt(i)));
			}
		}
		System.out.println(set.size());
	}

}
