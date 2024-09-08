import java.util.Scanner;

public class L2T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];
        int count = 0;

        while (count < 3) {
            System.out.print("Enter a positive number: ");
            int num = input.nextInt();
            
            if (num < 0) {
                System.out.println("Negative number entered. Please enter a positive number.");
            } else {
                numbers[count] = num;
                count++;
            }
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
