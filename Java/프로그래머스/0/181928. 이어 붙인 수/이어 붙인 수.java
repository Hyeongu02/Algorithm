class Solution {
    public int solution(int[] num_list) {
		String result2="";
		String result3="";
		for(int i=0;i<num_list.length;i++) {
			if(num_list[i]%2==1) {
				result2 += String.valueOf(num_list[i]);
			}
			else {
				result3 += String.valueOf(num_list[i]);
			}
		}       
        return Integer.valueOf(result2)+Integer.valueOf(result3);
    }
}