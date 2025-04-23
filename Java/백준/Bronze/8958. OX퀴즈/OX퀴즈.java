import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        String input=null;
        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            input=br.readLine();
            for(char x:input.toCharArray()){
                if(x=='O'){
                    count++;
                    sum+=count;
                }else{
                    count=0;
                }
            }
            bw.append(sum+"\n");
            count=0;
            sum=0;
        }
        bw.flush();
        bw.close();
    }
}
