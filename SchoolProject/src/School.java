import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private Scanner s1 = new Scanner(System.in);
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<String> courses = new ArrayList<>();

    School(int addteachers) {//the "addteachers" is just for calling the methonds in main the other parameters for the methods below also serve the same purpose
        System.out.println("How many teachers would you like to add?");
        int j = s1.nextInt();
        for (int i = 1; i <= j; i++) {
            teachers.add(new Teacher(i));
            courses.add(teachers.get(i-1).getSubject());
        }
    }//add teachers


    School() {
        System.out.println("How many students would you like to add?");
        int j = s1.nextInt();
        for (int i = 1; i <= j; i++) {
            students.add(new Student(i));
        }
    }// add students

    School(int showteachers, int W) {
        System.out.println("Teachers:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getprintoutTeachers());
        }
        System.out.println();
    }// show teachers

    School(int showstudents, int W, int Q){
        System.out.println("Students:");
        for( int i = 0; i < students.size(); i ++){
            System.out.println(students.get(i).getprintoutStudents());
        }
        System.out.println();
    }//show students

    School(int showbothteachersandstudents, int Q, int W, int P){
        System.out.println("Teachers:");
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i).getprintoutTeachers());
        }
        System.out.println();
        System.out.println("Students:");
        for( int i = 0; i < students.size(); i ++){
            System.out.println(students.get(i).getprintoutStudents());
        }
        System.out.println();
    }//shows both teachers and students

    School(int removestudents, int Q, int W, int P, int J){
        System.out.println("How many students would you like to remove?");
        int j = s1.nextInt();
        if(j == students.size()){
            students.clear();
        }else {
            for (int i = 0; i < j; i++) {
                students.remove(i);
            }
        }
        System.out.println();
    }//remove students

    School(int removeteachers, int Q, int W, int P, int E, int I){
        System.out.println("How many Teachers would you like to remove?");
        int j = s1.nextInt();
        if(j == teachers.size()){
            teachers.clear();
        }else {
            for (int i = 0; i < j; i++) {
                teachers.remove(i);
            }
        }
        System.out.println();
    }//remove teachers
}
