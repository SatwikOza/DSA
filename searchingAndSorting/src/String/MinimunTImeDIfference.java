package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimunTImeDIfference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> timePoints=new ArrayList<>();
		timePoints.add("23:59");
		timePoints.add("00:00");
		
		
		List<Integer> ans=new ArrayList<>();
		
		for(int i=0;i<timePoints.size();i++) {
			String time=timePoints.get(i);
			String hr=time.substring(0, 2);
			String min=time.substring(3,5);
			int hrInMin=Integer.valueOf(hr)*60;
			int minInMin=Integer.valueOf(min);
			ans.add(hrInMin+minInMin);
			
		}
		Collections.sort(ans);
		int finalAns=Integer.MAX_VALUE;
		for(int i=0;i<ans.size()-1;i++) {
			int diff=ans.get(i+1)-ans.get(i);
			if(finalAns > diff) {
				finalAns=diff;
			}
		}
		int handleCase=(ans.get(0)+1440)-(ans.get(ans.size()-1));
		if(finalAns > handleCase) {
			finalAns=handleCase;
		}
		
		System.out.println(finalAns);
		
	}

}
