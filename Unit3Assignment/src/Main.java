import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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
}