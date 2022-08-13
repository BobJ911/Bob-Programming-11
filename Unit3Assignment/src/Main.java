import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int arr1length = s1.nextInt();
        int[] arr1 = new int [arr1length];
        System.out.println("Please enter numbers into the array");
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = s1.nextInt();
        }
        System.out.println("The array is now full");


        System.out.println("Please enter how many numbers you would like to add/subtract");
        int user = s1.nextInt();
        System.out.println("Please enter the position of the number you would like to insert");
        int position = s1.nextInt();
        System.out.println("Please enter the number your would like to insert");
        int number = s1.nextInt();

        if (user > 0) {
            add(arr1, user);
            insert(arr1, add(arr1, user), position, number);
            for(int i = 0; i <add(arr1, user).length; i ++){
                System.out.println(insert(arr1, delete(arr1, user), position, number)[i]);
            }
        }else {
            delete(arr1, user);
            insert(arr1, delete(arr1, user), position, number);
            for(int i = 0; i <delete(arr1, user).length; i ++){
                System.out.println(insert(arr1, delete(arr1, user), position, number)[i]);
            }
        }
    }
    private static int[] add(int[] arr1, int user) {
        int[] arr2 = new int[arr1.length + user];
        return arr2;
    }

    private static int[] delete(int[] arr1,int user){
        int[] arr2 = new int[arr1.length + user];
        return arr2;
    }

    private static int[] insert(int[] arr1, int[] arr2, int position, int number){
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
        arr2[position] = number;
        return arr2;
    }
}