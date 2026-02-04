import java.util.Scanner;


public class Lab08_1_3 {
    public static void main(String[] argsr) {
        Scanner s = new Scanner(System.in);
        Student s1;

        s1 = new Student();

        System.out.println("This Program to compute grade.");
        System.out.println("Enter Student ID : ");
        s1.id = s.nextInt();
        System.out.println("Enter Firstname : ");
        s1.firstname = s.next();
        System.out.println("Enter Lastname : ");
        s1.lastname = s.next();
        System.out.println("Enter Midterm[30] : ");
        s1.mid = s.nextInt();
        System.out.println("Enter Final[30] : ");
        s1.fin = s.nextInt();
        System.out.println("Enter Homework[40] : ");
        s1.hw = s.nextInt();
        s1.total = s1.mid+s1.fin+s1.hw;
        if (s1.total >= 80)
            s1.grade = 'A';
        else if (s1.total >= 70)
            s1.grade = 'B';
        else if (s1.total >= 60)
            s1.grade = 'C';
        else if (s1.total >= 50)
            s1.grade = 'D';
        else s1.grade = 'F';


        System.out.println("------------------- Grade Report -------------------");
        System.out.println("ID : " + s1.id);
        System.out.println("Name : " + s1.firstname + " " + s1.lastname);
        System.out.println("Midterm : " + s1.mid);
        System.out.println("Final : " + s1.fin);
        System.out.println("Homework : " + s1.hw);
        System.out.println("----------------------------------------------------");
        System.out.println("Total : " + s1.total);
        System.out.println("Grade : " + s1.grade);
        System.out.println("----------------------------------------------------");
    }
}

