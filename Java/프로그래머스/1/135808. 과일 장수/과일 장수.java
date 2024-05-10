import java.util.Arrays;
class Solution {
    public int solution(int k, int m, int[] score) {
		int sum=0;
		int result=0;
		Arrays.sort(score);
		int re=score.length/m;
		for(int i=score.length-m;i>=0;i -=m) {
			
			sum +=score[i]*m;
			result +=sum;
			sum=0;
		}
        return result;
    }
}