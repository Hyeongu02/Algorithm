import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int[] basket=new int[N];
		for(int i=0;i<N;i++) {
			basket[i]=i+1;
		}
		int tmp=0,swap1=0,swap2=0;
		for(int i=0;i<M;i++) {
			swap1=in.nextInt();
			swap2=in.nextInt();
			tmp=basket[swap1-1];
			basket[swap1-1]=basket[swap2-1];
			basket[swap2-1]=tmp;
		}
		for(int i=0;i<N;i++) {
			System.out.print(basket[i]+" ");
		}
	}
} 