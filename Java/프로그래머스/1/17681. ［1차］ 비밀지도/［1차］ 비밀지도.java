class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		for(int i=0;i<n;i++) {
			StringBuffer sb= new StringBuffer();
			String tmp=Integer.toBinaryString(arr1[i]|arr2[i]);
            for(int j=0;j<n-tmp.length();j++) {
				sb.append(' ');
			}
			for(int j=0;j<tmp.length();j++) {
				if(tmp.charAt(j)=='1') sb.append('#');
				else sb.append(' ');
			}
			answer[i]=sb.toString();
		}
        return answer;
    }
}
