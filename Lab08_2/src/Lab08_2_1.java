import java.util.Scanner;

public class Lab08_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] id = new int[2];
        String[] firstname = new String[2];
        String[] lastname = new String[2];
        int[] mid = new int[2];
        int[] fin = new int[2];
        int[] hw = new int[2];
        int[] score = new int[2];
        char[] grade = new char[2];

        for (int i = 0;i < 2;i++) {
            System.out.print("Enter id : ");
            id[i] = input.nextInt();
            input.nextLine();
            System.out.print("Enter firstname : ");
            firstname[i] = input.nextLine();
            System.out.print("Enter lastname : ");
            lastname[i] = input.nextLine();
            System.out.print("Enter Midterm : ");
            mid[i] = input.nextInt();
            System.out.print("Enter Final : ");
            fin[i] = input.nextInt();
            System.out.print("Enter Homework : ");
            hw[i] = input.nextInt();
        }
        for (int i = 0;i < 2;i++) {
            score[i] = mid[i]+fin[i]+hw[i];

            if (score[i] >= 80 && score[i] <= 100) {
                grade[i] = 'A';
            } else if (score[i] < 80 && score[i] >= 70){
                grade[i] = 'B';
            } else if (score[i] < 70 && score[i] >= 60) {
                grade[i] = 'C';
            } else if (score[i] < 60 && score[i] >= 50) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }

            System.out.println("---------- Grade Report ----------");
            System.out.println("Student No."+(i+1));
            System.out.println("ID : "+id[i]);
            System.out.println("Name : "+firstname[i]+" "+lastname[i]);
            System.out.println("Midterm : "+mid[i]);
            System.out.println("Final : "+fin[i]);
            System.out.println("Homework : "+hw[i]);
            System.out.println("--------------------");
            System.out.println("Total : "+score[i]);
            System.out.println("Grade : "+grade[i]);

            System.out.println();
        }

    }
}
