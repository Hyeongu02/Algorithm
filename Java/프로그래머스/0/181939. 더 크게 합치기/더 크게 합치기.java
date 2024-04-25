class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (Integer.valueOf(String.valueOf(a)+String.valueOf(b))>Integer.valueOf(String.valueOf(b)+String.valueOf(a))) answer=Integer.valueOf(String.valueOf(a)+String.valueOf(b));
        else if (Integer.valueOf(String.valueOf(a)+String.valueOf(b))<Integer.valueOf(String.valueOf(b)+String.valueOf(a)));
        else answer=Integer.valueOf(String.valueOf(a)+String.valueOf(b));
        return answer;
    }
}