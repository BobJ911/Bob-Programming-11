import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
        int i = 0;
        while(i == 0){
            String j = s1.nextLine();
            if (j.equals("addstudents")) {
                School addstudents = new School();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
            }
            if (j.equals("addteachers")) {
                School addteachers = new School(0);
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
            }
            if (j.equals("showboth")) {
                School showstudentsandteachers = new School(0, 0, 0, 0);
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
            }
            if (j.equals("showstudents")) {
                School showstudents = new School(0, 0, 0);
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("showteachers")) {
                School showteachers = new School(0, 0);
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("removestudents")) {
                School removestudents = new School(0, 0, 0, 0, 0);
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("removeteachers")) {
                School removeteachers = new School(0, 0, 0, 0, 0, 0);
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("end")) {
                break;
            }
        }
    }
}
