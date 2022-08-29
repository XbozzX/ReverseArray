import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] userArray = {1,2,3,4,5};
        reverse(userArray);
    }

    private static void reverse(int[] userArray){

        int[] newUserArray = new int[userArray.length];
        int maxIndex = userArray.length - 1;
        //int halfIndex = userArray.length / 2;
        int temp = 0;
        for (int i = 0; i < userArray.length; i++){
            temp = userArray[i];
            newUserArray[i] = userArray[maxIndex - i];
            newUserArray[maxIndex - i] = temp;
        }
        System.out.println("Array = " +Arrays.toString(userArray) + "\nReversed array = " + Arrays.toString(newUserArray));
    }
}