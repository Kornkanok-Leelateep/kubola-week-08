public class Lab08_3_3 {
    public static void main(String[] args) {

        stu833[] s = new stu833[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nStudent " + (i + 1));
            s[i] = new stu833();
            s[i].sysTem3();
            s[i].total3();
            s[i].grade3();
        }

        for (int i = 0; i < 10; i++) {
            s[i].show3();
        }
    }
}