import java.util.Scanner;
public class Add{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first  value:");
		double a=sc.nextDouble();
		System.out.println("enter second value:");
		double b=sc.nextDouble();
		double sum=a+b;
		System.out.println("sum="+sum);
	}
}