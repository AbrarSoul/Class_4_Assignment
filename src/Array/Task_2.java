package Array;

import java.util.Scanner;

public class Task_2 {       // I did the bubble sort for my practice
   public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] < arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }

    }
    public static void main(String[] args) {
        int numbers[] = new int[50];
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers to input: ");
        int range = input.nextInt();

        for(int i=0;i<range;i++)
        {
            numbers[i] = input.nextInt();
        }
        bubbleSort(numbers);
        System.out.print("The Second Largest Number is: ");
        System.out.print(numbers[1]);
    }
}
