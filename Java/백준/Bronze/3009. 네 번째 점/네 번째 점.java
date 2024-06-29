import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str=br.readLine().split(" ");
        int[] x=new int[2];
        int[] y=new int[2];
        x[0]=Integer.parseInt(str[0]);
        y[0]=Integer.parseInt(str[1]);
        int xSum=x[0];
        int ySum=y[0];
        for(int i=0;i<2;i++) {
        	str=br.readLine().split(" ");
        	xSum+=Integer.parseInt(str[0]);
        	ySum+=Integer.parseInt(str[1]);
        	if(x[0]!=Integer.parseInt(str[0])) {
        		x[1]=Integer.parseInt(str[0]);
        	}
        	if(y[0]!=Integer.parseInt(str[1])) {
        		y[1]=Integer.parseInt(str[1]);
        	}
        }
        System.out.println((((xSum-x[0])/2.0==x[1])?x[0]:x[1])+" "+(((ySum-y[0])/2.0==y[1])?y[0]:y[1]));
    }
}
