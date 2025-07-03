import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		StringBuilder sb=new StringBuilder();
		int n= Integer.parseInt(br.readLine());
		int[] nums=new int[8001];
		int max=-4000;
		int min=4000;
		int input=0;
		int sum=0;
		for(int i=0;i<n;i++) {
			input=Integer.parseInt(br.readLine());
			nums[input+4000]++;
			if(input>max)max=input;//최대
			if(input<min)min=input;//최소
			sum+=input;//총합
		}
		//최빈값
		int arrMax=0;
		LinkedList<Integer>list=new LinkedList<Integer>();
		for(int i=min+4000;i<=max+4000;i++) {
			if(nums[i]>arrMax) {
				list=new LinkedList<Integer>();
				arrMax=nums[i];
				list.add(i-4000);
			}else if(nums[i]==arrMax) {
				list.add(i-4000);
			}
		}
		Collections.sort(list); //정렬한뒤에 list size에 따라 출력
		//중앙값
		int count=0;
		int mid=0;
		Loop: for(int i=min+4000;i<=max+4000;i++) {
			while(nums[i]!=0) {
				nums[i]--;
				count++;
				if(count==n/2+1) {
					mid=i-4000;
					break Loop;
				}
			}
		}
		//출력
		sb.append(Math.round(sum/(double)n)).append('\n');
		sb.append(mid).append('\n');
		if(list.size()==1) sb.append(list.peek()).append('\n');
		else sb.append(list.get(1)).append('\n');
		sb.append(max-min);
		System.out.print(sb);
	}
}