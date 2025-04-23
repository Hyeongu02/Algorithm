import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = null;
        int n=Integer.parseInt(br.readLine());
        for(int i=0; i<n;i++){
            input = br.readLine().split(" ");
            for(int j=0;j<input[1].length();j++){
                for(int k=0; k<Integer.parseInt(input[0]);k++){
                    bw.append(input[1].charAt(j));
                }
            }
            bw.append("\n");
        }
        bw.flush();
    }
}