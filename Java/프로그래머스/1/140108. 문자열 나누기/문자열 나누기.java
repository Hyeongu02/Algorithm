import java.util.Stack;
class Solution {
    static int solution(String s) {
		Stack<Character>stack=new Stack<Character>();
		stack.push(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(!stack.empty() && stack.peek()==s.charAt(i)) {
				stack.push(s.charAt(i));
			}else {
				if(stack.empty()) {
					if(i==s.length()-1) return 1;
					return 1+solution(s.substring(i+1));
				}
				stack.pop();
				if(i==s.length()-1) { 
					return 1;
				}
				if (stack.empty()) {
					return 1+solution(s.substring(i+1));
				}
			}
		}
		return 1;
    }
}