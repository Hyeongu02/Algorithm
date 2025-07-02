import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        int N = Integer.valueOf(br.readLine());
        int xMin = 100001;
        int xMax = -10001;
        int yMin = 100001;
        int yMax = -10001;
        for(int i=0; i<N;i++){
            String[] point = br.readLine().split(" ");
            if(xMax<Integer.valueOf(point[0])){
                xMax=Integer.valueOf(point[0]);
            }
            if(xMin>Integer.valueOf(point[0])){
                xMin=Integer.valueOf(point[0]);
            }
            if(yMax<Integer.valueOf(point[1])){
                yMax=Integer.valueOf(point[1]);
            }
            if(yMin>Integer.valueOf(point[1])){
                yMin=Integer.valueOf(point[1]);
            }
        }
        System.out.print((xMax-xMin)*(yMax-yMin));
    } 
}
