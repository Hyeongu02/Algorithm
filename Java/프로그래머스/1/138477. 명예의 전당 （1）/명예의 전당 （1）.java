import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list=new ArrayList<Integer>();
		List<Integer> tmp=new ArrayList<Integer>();
		for(int i:score) {
			list.add(i);
			list.sort(Comparator.reverseOrder());
			tmp.add(list.get((list.size()<k)?list.size()-1:k-1));
		}
        int[] answer = tmp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}