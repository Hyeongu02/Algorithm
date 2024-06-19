import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb=new StringBuilder();
		int t=Integer.parseInt(br.readLine());
		String str;
		for(int i=0;i<t;i++) {
			Stack<Character>stack=new Stack<Character>();
			str=br.readLine();
			if(str.charAt(0)==')') { //첫번째가 )이면 바로 NO
				sb.append("NO").append('\n');
				continue;
			}
			stack.push(str.charAt(0));
			for(int j=1;j<str.length();j++) {
				if(!stack.empty()&&stack.peek()!=str.charAt(j)) { //스택이 비어있지 않고 이전것과 다르면
					stack.pop();
				}else if(stack.empty()&&str.charAt(j)==')') { //스택이 비워져있는 상태에서 )가 들어올때
					stack.push('1');
					break;
				}else {//비어저있거나 이전것과 같을때
					stack.push(str.charAt(j));
				}
			}
			if(stack.size()==0) sb.append("YES").append('\n');
			else sb.append("NO").append('\n');
		}
		System.out.println(sb);
	}
}