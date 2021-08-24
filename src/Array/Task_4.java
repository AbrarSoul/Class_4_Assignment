package Array;

import java.util.Scanner;

public class Task_4 {
    public static int matchedValue(int num, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers to input: ");
        int range = input.nextInt();
        int numbers[] = new int[range];

        for(int i=0;i<range;i++)
        {
            numbers[i] = input.nextInt();
        }

        System.out.print("Enter a number to find: ");
        int num = input.nextInt();
        int output = matchedValue(num, numbers);
        if(output>0){
            System.out.println("Position: "+output);
        }
        else{
            System.out.println("Not found!");
        }

    }
}
