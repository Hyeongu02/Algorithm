import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String[] input=br.readLine().split(" ");
		int m=Integer.parseInt(input[0]);
		int n=Integer.parseInt(input[1]);
		String[] str=new String[m];
		for(int i=0;i<m;i++) {
			str[i]=br.readLine();
		}
		int min=10000;
		for(int i=0;i<m-7;i++) {
			for(int j=0;j<n-7;j++) {
				for(int x=0;x<2;x++) { //2번 반복
					int count=0;
					char chess1=(x==0)?'B':'W';
					char chess2=(x==0)?'W':'B';
					for(int p=i;p<i+8;p++) {
						char check=(p%2==0)?chess1:chess2;
						for(int q=j;q<j+8;q++) {
							if (str[p].charAt(q)!=check) count++;
							check=(check==chess1)?chess2:chess1;
						}
					}
					if(min>count) min=count;
				}
			}
		}
		System.out.println(min);
	}
}