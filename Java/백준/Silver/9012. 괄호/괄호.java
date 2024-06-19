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
			if(str.charAt(0)==')') {
				sb.append("NO").append('\n');
				continue;
			}
			for(int j=0;j<str.length();j++) {
				if(str.charAt(j)=='(') { 
					stack.push(str.charAt(j));
				}else if(stack.empty()){
					stack.push('1');
					break;
				}else {
					stack.pop();
				}
			}
			if(stack.size()==0) sb.append("YES").append('\n');
			else sb.append("NO").append('\n');
		}
		System.out.println(sb);
	}
}