package String;

import java.util.Arrays;

public class StringCompression443 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars= {'a','a','a','b','b','a','a'};
		
		 Arrays.sort(chars);
			String s=new String(chars);
	        if(s.length()-1 ==0){
//				return 1;
			}
			//System.out.println(new String(chars));
			char pre=s.charAt(0);
			int count=0;
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i) == pre) {
					count++;
				}else {
					sb.append(s.charAt(i-1));
					if(count>1) {
						sb.append(count);
						}
					count=1;
					pre=s.charAt(i);
				}
			}
			sb.append(s.charAt(s.length()-1));
			if(count>1) {
			sb.append(count);
			}
	        char[] c=new char[sb.length()];
			for(int i=0;i<sb.length();i++){
				chars[i]=sb.charAt(i);
				System.out.println(chars[i]);
	        }
			
			System.out.println(c.length);
//			return sb.length();
	}

}
