package recursion;

import java.util.ArrayList;
import java.util.List;

public class IncludeExcludePattern {
	
	//ALSO DO THIS SAME THING WITH BITMASKING

	public static void main(String[] args) {

		String str="abc";
		String out="";
		int i=0;
		List<String> list=new ArrayList<>();
		printSubstring(str,out,i,list);
		System.out.println(list);
		
	}

	private static void printSubstring(String str, String out, int i,List<String> list) {
		
		//BASE CASE
		if(i==str.length()) {
			System.out.println(out);
			list.add(out);
			return;
		}
		//EXCLUDE CASE
		printSubstring(str, out, i+1,list);
		//INCLUDE CASE
		out+=str.charAt(i);
		printSubstring(str, out, i+1,list);
	}

}
