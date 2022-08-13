import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        School school = new School();
        System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
        int i = 0;
        while(i == 0){
            String j = s1.nextLine();
            if (j.equals("addstudents")) {
                school.addstudents();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
            }
            if (j.equals("addteachers")) {
                school.addteachers();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
            }
            if (j.equals("showboth")) {
                school.showboth();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");
            }
            if (j.equals("showstudents")) {
                school.showstudents();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("showteachers")) {
                school.showteachers();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("removestudents")) {
                school.removestudents();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("removeteachers")) {
                school.removeteachers();
                System.out.println("type: \"addstudents\" to add students, \"addteachers\" to add teachers, \"showboth\" to show both teachers and students, \"showstudents\" to only show students, \"showteachers\" to only show teachers, \"removestudents\" to remove students, \"removeteachers\" to remove teachers, \"end\" to end");

            }
            if (j.equals("end")) {
                break;
            }
        }
    }
}
