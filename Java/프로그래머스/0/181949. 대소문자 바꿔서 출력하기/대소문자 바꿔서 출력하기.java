import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result="";
        int tmp=0;
        for (int i=0;i<a.length();i++) {
        	tmp=a.charAt(i);
        	if('A'<=tmp&&tmp<='Z'){
        		tmp +=32;
        	}
        	else {
        		tmp -=32;
        	}
        	result +=(char)tmp;
        }
        System.out.println(result);
    }
}