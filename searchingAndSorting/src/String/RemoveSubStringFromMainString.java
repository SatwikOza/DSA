package String;

public class RemoveSubStringFromMainString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String mainStr="daaabcadsgrasaabbabc";
//		StringBuilder sb=new StringBuilder(mainStr);
//		String subStr="abc";
//		int index = sb.indexOf(subStr);
//		while(index>-1) {
//			sb=sb.delete(index, subStr.length());
//			index = sb.indexOf(subStr);
//			System.out.println(sb);
//		}
		 String mainStr = "daaabcadsgrasaabbabc";
	        StringBuilder sb = new StringBuilder(mainStr);
	        String subStr = "abc";
	        int index = sb.indexOf(subStr);

	        while (index > -1) {
	            sb.delete(index, index + subStr.length());
	            index = sb.indexOf(subStr);
	        }

	        System.out.println(sb);
//		for(int i=0;i<sb.length()-2;i++) {
//			String find = (String) mainStr.subSequence(i, i+3);
//			if(subStr.equals(find)) {
//				sb.delete(i, i+3);
//				i=i+2;
//			}
//mainStr.concat(subStr);
//		}
		System.out.println(sb);

}
}
