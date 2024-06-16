import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        int[] a=new int[26];
		List<Integer> tmp=new ArrayList<Integer>();
		for(int i=0;i<s.length();i++) {
			if (a[s.charAt(i)-'a']!=0) tmp.add(i+1-a[s.charAt(i)-'a']);
			else tmp.add(-1);
			a[s.charAt(i)-'a']=i+1;
		}
        answer=tmp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
} 