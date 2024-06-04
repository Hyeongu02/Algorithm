import java.util.ArrayList;
class Solution {
    public String solution(String s, String skip, int index) {
		String result="";
		ArrayList<Character> list=new ArrayList<Character>();
		for(int i=0;i<26;i++) {
			list.add((char)(i+97));
		}
		for(int i=0;i<skip.length();i++) {
			list.remove(new Character(skip.charAt(i)));
		}
		for(int i=0;i<s.length();i++) {
			int find=list.indexOf(s.charAt(i))+index;
			while(find>=list.size()) {
				find-=list.size();
			}
			result+=list.get(find);
		}
        return result;
    }
}