import java.util.Arrays;
class Solution {
    public int solution(int a, int b, int c) {
		int answer=0;
		int[] arr= {a,b,c};
		Arrays.sort(arr);
		if(arr[0]!=arr[1]&&arr[1]!=arr[2]) {
			answer=a+b+c;
		}
		else if(arr[0]==arr[2]) {
			answer=(a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
		}
		else if(arr[0]==arr[1]||arr[1]==arr[2]) {
			answer=(a+b+c)*(a*a+b*b+c*c);
		}
        return answer;
    }
}