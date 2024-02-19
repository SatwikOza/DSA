package String;

public class RemoveDuplicatesString {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abbacd";
		StringBuilder newStr=new StringBuilder();
		
		int i=0;
		
		while(i<str.length()) {
			if(newStr.length()==0) {
				newStr.append(str.charAt(i));
			}else if(newStr.charAt(newStr.length()-1) != str.charAt(i)) {
				newStr.append(str.charAt(i));
			}else {
				newStr.deleteCharAt(newStr.length()-1);
			}
			i++;
		}
		
		System.out.println(newStr);
		
		
		}
	}


