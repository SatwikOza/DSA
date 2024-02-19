package String;

public class Palindromll {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		String str="abca";
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return checkPalindrom(i,j-1,str) || checkPalindrom(i-1,j,str);
			}else {
				i++;
				j--;
			}
		}
		return true;
	}

	private static boolean checkPalindrom(int i, int j,String str) {
		// TODO Auto-generated method stub
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}else{
				i++;
				j--;
			}
			
		}
		return true;
	}

}
