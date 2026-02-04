import java.util.Scanner;

public class Lab08_1_1 {
    public static void main(String[] argsr) {
        Scanner s = new Scanner(System.in);
        int id;
        String firstname,lastname;
        int mid,fin,hw,total;
        char grade;

        System.out.println("This Program to compute grade.");
        System.out.println("Enter Student ID : ");
        id = s.nextInt();
        System.out.println("Enter Firstname : ");
        firstname = s.next();
        System.out.println("Enter Lastname : ");
        lastname = s.next();
        System.out.println("Enter Midterm[30] : ");
        mid = s.nextInt();
        System.out.println("Enter Final[30] : ");
        fin = s.nextInt();
        System.out.println("Enter Homework[40] : ");
        hw = s.nextInt();
        total = mid+fin+hw;
        if (total >= 80)
            grade = 'A';
        else if (total >= 70)
            grade = 'B';
        else if (total >= 60)
            grade = 'C';
        else if (total >= 50)
            grade = 'D';
        else grade = 'F';

        System.out.println("------------------- Grade Report -------------------");
        System.out.println("ID : " + id);
        System.out.println("Name : " + firstname + " " + lastname);
        System.out.println("Midterm : " + mid);
        System.out.println("Final : " + fin);
        System.out.println("Homework : " + hw);
        System.out.println("----------------------------------------------------");
        System.out.println("Total : " + total);
        System.out.println("Grade : " + grade);
        System.out.println("----------------------------------------------------");
    }
}
