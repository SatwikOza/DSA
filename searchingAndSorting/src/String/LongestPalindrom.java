package String;

public class LongestPalindrom {

	private static boolean isPalindron(String s, int i, int j) {

		while(i<=j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="geeksskeeg";
		String ans="";
		for(int i=0;i<s.length();i++){
			System.out.println("i = "+i);
	          for(int j=i;j<s.length();j++){
	        	  if(isPalindron(s,i,j)){
	        		  String subString=s.substring(i, j+1);
	                  if(subString.length()>ans.length()){
	                	  System.out.println(s.substring(i,j+1));
	                      ans=subString;
	                      System.out.println("MainAns="+ans);
	                  }
	              }
	          }
	      }  
	}

}
