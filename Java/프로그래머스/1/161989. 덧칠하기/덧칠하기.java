class Solution {
    public int solution(int n, int m, int[] section) {
		int count=0;
		Boolean[] p=new Boolean[n];
		for(int i=0;i<n;i++) {
			p[i]=true;
		}
		for (int i:section) {
			if (p[i-1]==true) {
				for(int j=i-1;j<((i+m-1)<=n?i+m-1:n);j++) {
					p[j]=false;
				}
				count++;
			}
		}
		return count;
    }
}