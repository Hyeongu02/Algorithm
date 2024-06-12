import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
		Queue<Integer> que = new LinkedList<Integer>();
		int count=-1;
			for(int i:arr) {
				if(i==count) continue;
				que.add(i);
				count=i;
			}
		answer = que.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}