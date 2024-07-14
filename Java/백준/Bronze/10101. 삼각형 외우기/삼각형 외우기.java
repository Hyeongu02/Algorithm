import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException  {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	int[] nums=new int[3];
    	for(int i=0;i<3;i++) {
    			nums[i]=Integer.parseInt(br.readLine());
    	}
    	if(nums[0]+nums[1]+nums[2]==180) {
    		if(nums[0]==nums[1]&&nums[1]==nums[2]&&nums[0]==nums[2]) {
    			System.out.println("Equilateral");
    		}else if(nums[0]==nums[1]||nums[1]==nums[2]||nums[0]==nums[2]) {
    			System.out.println("Isosceles");
    		}else {
    			System.out.println("Scalene");
    		}
    	}else {
    		System.out.println("Error");
    	}
    }
}
