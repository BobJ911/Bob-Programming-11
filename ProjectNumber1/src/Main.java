/*        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner s1 = new Scanner(System.in);
        int user = s1.nextInt();
        int position = s1.nextInt();
        int number = s1.nextInt();
        int[] arr2 = new int[arr1.length + user];

        if (user > 0) {
            add(arr1, arr2, position);
            insertnumber(arr2,position, number);
            print(arr2);
        }else {
            delete(arr1, arr2, user, position);
            insertnumber(arr2,position, number);
            print(arr2);
        }
    }

    private static void add(int[] arr1, int[] arr2, int position) {
        for (int i = 0; i < arr1.length; i++) {
            if (i >= position) {
                if (i == arr2.length - 1) {
                    break;
                } else {
                    arr2[i + 1] = arr1[i];
                }
            } else {
                arr2[i] = arr1[i];
            }
        }
    }
    private static void delete(int[] arr1,int[] arr2, int user, int position){
        for (int i = 0; i < arr1.length+user; i++) {
            if (i >= position) {
                if(i == arr2.length-1) {
                    break;
                }else{
                    arr2[i + 1] = arr1[i];
                }
            } else {
                arr2[i] = arr1[i];
            }
        }
    }

    private static void insertnumber(int[] arr2, int position, int number){
        arr2[position] = number;
    }

    private static void print(int[] arr2){
        for(int i = 0; i<arr2.length; i++){
            System.out.print(arr2[i] + "\t");
        }
    }
}*/
import java.util.Scanner;
public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s) {
        //TODO
        int counter = 0;
        for (int j = 1; j - 1 < s.length(); j++) {
            if (s.substring(j - 1, j).equals("a") || s.substring(j - 1, j).equals("e") || s.substring(j - 1, j).equals("i") || s.substring(j - 1, j).equals("o") || s.substring(j - 1, j).equals("u")) {
                counter += 1;
            }
        }
        return counter;
    }

    //Code you problem number two here
    static int problemTwo(String s) {
        //TODO
        int counter = 0;
        for (int j = 1; j - 1 < s.length(); j++) {
            if (j - 3 < s.length()&&j-4>=0) {
                int o = j-2;
                if (s.substring(o - 1, o + 2).equals("bob")) {
                    counter += 1;
                }
            }
            if ( j == 1){
                if (s.substring(j - 1, j + 2).equals("bob")) {
                    counter += 1;
                }
            }
        }
        return counter;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //TODO
        int counter = 0;
        int c1 = 0;
        int c2 = 0;
        int o;
        int p;
        char l1;
        char l2;
        char l3;
        int o1;
        String b2 = "";
        String b = "";
        int[] arr1 = new int[s.length()];
        for (int j = 0; j < s.length(); j++) {
            int a = Character.getNumericValue(s.charAt(j));
            arr1[j] = a;
        }

        for (int j = 0; j + 1 < s.length(); j++) {

            if (arr1[j] <= arr1[j + 1] && counter == 0) {
                o = arr1[j] + 87;
                l1 = (char) o;
                b = Character.toString(l1);
                counter += 1;
            }

            if (arr1[j] <= arr1[j + 1] && counter > 0) {
                o = arr1[j+1] +87 ;
                l2 = (char) o;
                b += Character.toString(l2);
                counter += 1;
            }

            if (arr1[j] > arr1[j + 1] && c1 == 0) {
                c2 = counter;
                c1++;
            }
            if (counter>c2) {
                b2 = b;
                c2 = counter;
            }
            if (arr1[j] > arr1[j + 1] && c1 != 0) {
                counter = 0;
                b = "";
            }
        }
        if (b2.equals("")){
            o1 = arr1[0] + 87;
            l3 = (char) o1;
            b2 = Character.toString(l3);
        }
        return b2;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        problemOne("iueuaondjmhoiuxj");

    }
}
