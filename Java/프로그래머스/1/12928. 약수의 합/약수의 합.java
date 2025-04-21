import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                answer+=i+n/i;
            }
        }
        if(n%Math.sqrt(n)==0) answer+=Math.sqrt(n);
        return answer;
    }
    
    public static void main(String[] args) {
        Solution c = new Solution();
        System.out.println(c.solution(12));
    }
}