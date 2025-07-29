import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] N = br.readLine().toCharArray();
        int[] arr =new int[10];
        for(char x:N){
            arr[x-'0']++;
        }
        arr[6]=(arr[6]+arr[9])/2+(arr[6]+arr[9])%2;
        arr[9]=0;
        int max=0;
        
        for(int x: arr){
            if(max<x){
                max=x;
            }
        }
        System.out.println(max);
    }
}