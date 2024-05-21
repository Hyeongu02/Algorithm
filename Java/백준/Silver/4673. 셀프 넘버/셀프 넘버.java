public class Main {
	public static void main(String[] args) {
		boolean[] check=new boolean[100001];
		for(int i=1;i<=10000;i++) {
			int n=d(i);
			if(n<=10000) check[n]=true;
		}
		for(int i=1;i<=10000;i++) {
			if(check[i] ==false) System.out.println(i);;
		}
	}
	static int d(int n) {
		int sum=n;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}