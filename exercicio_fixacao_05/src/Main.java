import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hour;
		double work, total;
		
		num = sc.nextInt();
		hour = sc.nextInt();
		work = sc.nextDouble();
		
		total = hour * work;
		
		System.out.printf("Number = " + num);
		System.out.printf("Salary = U$ %.2f%n", total);
		
		
		sc.close();
	}

}
