import java.util.*;
import java.io.*;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> list = new ArrayList();
        int max =0;
        
        while (true) {
            list.add(Integer.parseInt(br.readLine()));
            if (max<list.get(list.size()-1)) {
                max =list.get(list.size()-1);
            }else if(list.get(list.size()-1)==0) break;
        }
        
        boolean[] num = new boolean[max*2+1];
        for(int i=2;i*i<num.length;i++){
            for(int j=i*i;j<num.length;j+=i){
                num[j]=true;
            }
        }

        int count = 0;
        for(int i=0;i< list.size()-1;i++){
            for(int j=list.get(i)+1;j<=list.get(i)*2;j++){
                if(!num[j]) count++;
            }
            bw.write(count+"\n");
            count =0;
        }
        bw.flush();
	}
}