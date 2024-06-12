class Solution {
    public int solution(int n) {
        int answer=(n/2-1)>0?n/2-1:0;
		for(int i=9;i<=n;i+=2) {
			int count=0;
			for(int j=1;j*j<=i;j++) {
				if(j*j==i)count++;
				else if(i%j==0)count+=2;
				if(count>=3) break;
			}
			if(count>=3) answer++; 
		}
        return answer;
    }
}