class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
		for(int i=0;i<n;i++) {
			StringBuffer sb= new StringBuffer();
			String tmp=Integer.toBinaryString(arr1[i]|arr2[i]);
            tmp=tmp.replaceAll("1", "#");
			tmp=tmp.replaceAll("0", " ");
			for(int j=0;j<n-tmp.length();j++) {
				sb.append(' ');
			}
			tmp=sb.toString().concat(tmp);
			answer[i]=tmp;
		}
        return answer;
    }
}