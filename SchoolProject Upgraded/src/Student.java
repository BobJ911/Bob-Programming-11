import java.util.Scanner;

public class Student {
    private Scanner s1 = new Scanner(System.in);
    private String firstname;
    private String lastname;

    public String getprintoutStudents() {
        return printoutStudents;
    }

    public void setprintoutStudents(String printoutStudents) {
        this.printoutStudents = printoutStudents;
    }

    private String printoutStudents;
    static int defaultID;
    private int studentID;
    private int grade;


    Student (int i){
        System.out.println("enter student" +i+" firstname:");
        firstname = s1.nextLine();
        System.out.println("enter student" +i+" lastname:");
        lastname = s1.nextLine();

        int max = 12;
        int min = 1;
        grade = (int) (Math.random() * (max - min + 1) + min);

        studentID = defaultID;
        defaultID++;

        printoutStudents = "Name: " + firstname +" "+ lastname + " Grade: " + grade;
        System.out.println();
    }//code for user to enter data for a new teacher
}
