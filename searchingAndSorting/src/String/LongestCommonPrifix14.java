package String;

import java.util.Collections;

public class LongestCommonPrifix14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[]= {"a"};
		
			int j=0;
			int i=0;
			StringBuilder sb=new StringBuilder();
			boolean traverse=true;
			String cah="";
			char ch;
			
			cah.contains(sb);
			cah.contains("s");
			while(traverse) {
				char currentStr=' ';
				for(String str : strs) {
					if(i > str.length()-1) {
						traverse=false;
						break;
						
					}
					if(currentStr == ' ') {
						currentStr=str.charAt(i);
					}else {
						if(currentStr != str.charAt(i)) {
							traverse=false;
							break;
						}
					}
				}
				if(traverse) {
				sb.append(strs[0].charAt(i));
				i++;
				}
			}
//			for(int i=0;i<strs.length;i++) {
//				if(sb.length()== j ) {
//					sb.append(strs[i].charAt(j)); 
//				}
//				sb.append(strs[i].charAt(j));
//				if(sb.charAt(j) != strs[i].charAt(j)) {
//					traverse=false;
//				}else {
//					j++;
//				}
//			}
//		}
//		sb.deleteCharAt(j);
		System.out.println(sb);
	}

}
