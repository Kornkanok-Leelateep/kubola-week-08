import java.util.Scanner;

public class stu833 {
    int id;
    String first, last;
    int mid, fin, hw, total;
    char g;

    public void sysTem3() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter id : ");
        id = input.nextInt();

        System.out.print("Enter first name : ");
        first = input.next();

        System.out.print("Enter last name : ");
        last = input.next();

        System.out.print("Enter midterm [30] : ");
        mid = input.nextInt();

        System.out.print("Enter final [30] : ");
        fin = input.nextInt();

        System.out.print("Enter homework [40] : ");
        hw = input.nextInt();
    }

    public void total3() {
        total = mid + fin + hw;
    }

    public void grade3() {
        if (total >= 80)
            g = 'A';
        else if (total >= 70)
            g = 'B';
        else if (total >= 60)
            g = 'C';
        else if (total >= 50)
            g = 'D';
        else
            g = 'F';
    }

    public void show3() {
        System.out.println("------------- Grade Report -----------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + first + " " + last);
        System.out.println("Total : " + total);
        System.out.println("Grade : " + g);
        System.out.println("-------------------------------------");
    }
}
