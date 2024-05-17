import java.util.Arrays;

class Solution {
    public long solution(long n) {
		String a=String.valueOf(n);
		String[] b=a.split("");
		Arrays.sort(b);
		long answer = 0;
		for(int i=0;i<a.length();i++) {
			answer +=Integer.parseInt(b[i])*Math.pow(10, i);
		}
        return answer;
    }
}