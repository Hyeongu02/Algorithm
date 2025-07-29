import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[Integer.parseInt(br.readLine())];
        String[] arr = br.readLine().split(" ");
        for(int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(arr[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int[] sumNum = new int[x+1];
        int answer=0;
        for(int i=0; i<num.length;i++){
            if(num[i]<x){
                if(sumNum[x-num[i]]==1){
                    answer++;
                }
                sumNum[num[i]]=1;
            }
        }
        System.out.println(answer);
    }
}