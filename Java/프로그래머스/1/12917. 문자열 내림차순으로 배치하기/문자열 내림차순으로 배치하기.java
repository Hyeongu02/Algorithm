import java.util.Arrays;
class Solution {
    public String solution(String s) {
        StringBuffer sb=new StringBuffer();
		int[] arr=s.chars().toArray();
		Arrays.sort(arr);
		for(int i:arr) {
			sb.append((char)i);
		}
        return sb.reverse().toString();
    }
}