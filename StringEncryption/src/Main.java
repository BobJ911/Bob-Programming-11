import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String user = s1.nextLine();
        int length1 = user.length() - 1;
        int length2 = user.length();
        System.out.print(user.substring(length1, length2)+user.substring(0,length1)+"ay");
    }
}