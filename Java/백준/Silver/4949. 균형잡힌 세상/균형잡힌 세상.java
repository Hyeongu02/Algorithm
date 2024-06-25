import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb=new StringBuilder();
		Loop:while(true) {
			Stack<Character> stack = new Stack<>();
			String str=br.readLine();
			Boolean flag=false;
			if(str.equals(".")) break; //.있으면 멈춤
			for(int i=0;i<str.length();i++) { //문자열 길이만큼 반복
				if(str.charAt(i)=='['||str.charAt(i)=='(') {
					stack.push(str.charAt(i));
				}
				if(str.charAt(i)==']') {
					if(stack.isEmpty()||stack.peek()=='(') {
						sb.append("no").append('\n');
						continue Loop;
					}else {
						stack.pop();
					}
				}
				if(str.charAt(i)==')') {
					if(stack.isEmpty()||stack.peek()=='[') {
						sb.append("no").append('\n');
						continue Loop;
					}else {
						stack.pop();
					}
				}
			}
			if(stack.isEmpty()) sb.append("yes").append('\n');
			else sb.append("no").append('\n');
		}
		System.out.println(sb);
	}
}