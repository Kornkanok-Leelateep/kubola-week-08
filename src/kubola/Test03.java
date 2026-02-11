package kubola;
import java.util.Scanner;
public class Test03 {

	public static void main(String[] args) {
		Scanner input  = new Scanner(System.in);
		int numData,n,max,min;
		numData = input.nextInt();
		n = input.nextInt();
		max = n;
		min = n;
		for (int i=1;i<numData;i++) {
			n = input.nextInt();
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}
		System.out.println(min);
		System.out.println(max);
		}
	}


