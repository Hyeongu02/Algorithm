import java.util.Collections;
class Solution {
    public String solution(String s) {
        StringBuffer sb=new StringBuffer();
		int[] arr=s.chars().boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		for(int i:arr) {
			sb.append((char)i);
		}
        return sb.toString();
    }
}