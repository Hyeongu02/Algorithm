class Solution {
    public long solution(long n) {
        return (long)(((int)Math.sqrt(n)*Math.sqrt(n)==n)?Math.pow(Math.sqrt(n)+1,2):-1);
    }
}