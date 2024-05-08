import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        		int[] answer = new int[queries.length];
		for(int i=0;i<queries.length;i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
			int queries_len=queries[i][1]-queries[i][0]+1;
			int[] tmp=new int[queries_len+1];
			for(int j=s;j<=e;j++) {
				tmp[j-s]=arr[j];
			}
			tmp[e-s+1]=k;
			Arrays.sort(tmp);
			for(int m=0;m<tmp.length;m++) {
				if(tmp[m]>queries[i][2]) {
					answer[i]=tmp[m];
					break;
				}
				else{
					answer[i]=-1;
				}
			}
		}
        return answer;
    }
}
