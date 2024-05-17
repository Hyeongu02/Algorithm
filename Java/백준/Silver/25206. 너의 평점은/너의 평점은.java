import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		double gpa=0.0;
		int sum=0;
		for(int i=0;i<20;i++) {
			String input=in.nextLine();
			String[] text=input.split(" ");
			double graduate=Double.valueOf(text[1]);
			String gradeText=text[2];
			double grade=0;
			switch (gradeText) {
			case "A+":
				grade=4.5;
				break;
			case "A0":
				grade=4.0;
				break;
			case "B+":
				grade=3.5;
				break;
			case "B0":
				grade=3.0;
				break;
			case "C+":
				grade=2.5;
				break;
			case "C0":
				grade=2.0;
				break;
			case "D+":
				grade=1.5;
				break;
			case "D0":
				grade=1.0;
				break;
			case "F":
				grade=0.0;
				break;
			case "P":
				graduate=0;
				break;
			}
			gpa +=grade*graduate;
			sum+=graduate;
		}
		in.close();
		gpa /=sum;
		System.out.print(gpa);
	}
} 