package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to input: ");
        int range = input.nextInt();
        int numbers[] = new int[range];

        for(int i=0;i<range;i++)
        {
            numbers[i] = input.nextInt();
        }

        System.out.print("Duplicate numbers in array: ");

        int count=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    count++;
                }
            }
        }

        int output[] = new int[count];
        int k=0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    output[k] = numbers[j];
                    k++;
                }
            }
        }

        Arrays.sort(output);
        for(int i=0;i<count;i++){
            System.out.print(output[i]+" ");
        }
    }
}
