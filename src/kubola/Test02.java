package kubola;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,b,c,sum;
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		sum = a+b+c;
		if (sum >= 80 && sum <= 100) {
			System.out.print("A");
		}
		if (sum >= 75 && sum <= 79) {
			System.out.print("B+");
		}
		if (sum >= 70 && sum <= 74) {
			System.out.print("B");
		}
		if (sum >= 65 && sum <= 69) {
			System.out.print("C+");
		}
		if (sum >= 60 && sum <= 64) {
			System.out.print("C");
		}
		if (sum >= 55 && sum <= 59) {
			System.out.print("D+");
		}
		if (sum >= 50 && sum <= 54) {
			System.out.print("D");
		}
		if (sum >= 0 && sum <= 49) {
			System.out.print("F");
		}
	}

}
