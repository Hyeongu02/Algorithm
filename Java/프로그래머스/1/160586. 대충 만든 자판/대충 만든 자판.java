class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++) {
        	int sum=0;
        	for(int j=0;j<targets[i].length();j++) {
        		int min=10001;
        		for(int k=0;k<keymap.length;k++) {
        			if (min>keymap[k].indexOf(String.valueOf(targets[i].charAt(j)))&&-1!=keymap[k].indexOf(String.valueOf(targets[i].charAt(j)))) min=keymap[k].indexOf(String.valueOf(targets[i].charAt(j)));
        		}
        		sum+=min+1;
        	}
        	answer[i]=(sum!=0)?(sum>10001)?-1:sum:-1;
        }
        return answer;
    }
}