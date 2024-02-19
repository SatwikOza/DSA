package String;

public class SubStringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abc";
		int count =0;
		
		for(int i =0;i<s.length();i++) {
			//odd
			int oddKaAns=expandAroundEvent(s,i,i);
			count = count+oddKaAns;
			
			//even
			int evenKaAns=expandAroundEvent(s,i,i+1);
			count = count+evenKaAns;
		}
		System.out.println(count);

	}

	private static int expandAroundEvent(String s, int i, int j) {
		// TODO Auto-generated method stub
		int count =0;
		while(i>=0 && j<s.length()&&s.charAt(i)==s.charAt(j)) {
			count++;
			i--;
			j++;
		}
		return count;
	}

}
