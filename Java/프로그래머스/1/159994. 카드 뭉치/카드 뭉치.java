import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> list1=new LinkedList<String>(Arrays.asList(cards1));
		Queue<String> list2=new LinkedList<String>(Arrays.asList(cards2));
		for(int i=0;i<goal.length;i++) {
			if (goal[i].equals(list1.peek())) {
				list1.poll();
			}else if(goal[i].equals(list2.peek())) {
				list2.poll();
			}else {
				return "No";
			}
		}
		return "Yes";
    }
}