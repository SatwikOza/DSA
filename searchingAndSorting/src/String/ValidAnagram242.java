package String;

public class ValidAnagram242 {

	public static boolean main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="tot";
		String t="tto";
		if(s.length() != t.length()){
            return false;
        }
          char[] sc = s.toCharArray();

        char[] tc = t.toCharArray();

        // Sort the character array
        java.util.Arrays.sort(sc);
        java.util.Arrays.sort(tc);

        // Create a new string from the sorted character array
        String sss = new String(sc);
         String sst = new String(tc);
         System.out.println(sss);
         System.out.println(sst);
         
        int sCount=0;
        int tCount=0;
        for(int i=0;i<sss.length();i++){
            sCount += (int)sss.charAt(i);
            tCount += (int)sst.charAt(i);
            if(sCount != tCount){
            return false;
        }
        }
        return true;
    }
}
