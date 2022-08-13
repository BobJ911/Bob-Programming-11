import java.util.Scanner;
public class Teacher {
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    private String subject;

    public String getprintoutTeachers() {
        return printoutTeachers;
    }

    public void setprintoutTeachers(String printoutTeachers) {
        this.printoutTeachers = printoutTeachers;
    }

    private String printoutTeachers;
    private Scanner s1 = new Scanner(System.in);
    private String firstname;
    private String lastname;
    Teacher (int i){
            System.out.println("enter teacher" +i+" firstname:");
            firstname = s1.nextLine();
            System.out.println("enter teacher" +i+" lastname:");
            lastname = s1.nextLine();
            System.out.println("enter teacher" +i+" subject:");
            subject = s1.nextLine();
            printoutTeachers = "Name: " + firstname +" "+ lastname + " Subject: " + subject;
            System.out.println();
    }//code for user to enter data for a new teacher
}