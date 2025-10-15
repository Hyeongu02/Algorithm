import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count=0;
        int sum=0;
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(c=='*'){
                count=i;
            }else{
                sum+=(c-48)*((i%2==0)?1:3);
            }
        }
        for(int i=0;i<=9;i++){
            if((sum+i*((count%2==0)?1:3))%10==0){
                System.out.print(i);
                return;
            }
        }
    }
}