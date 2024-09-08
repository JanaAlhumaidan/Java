import java.util.Scanner;

public class L1T1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = input.nextInt(); 
        int age = 2024 - year;
        System.out.println("your age is: " + age); 
    }
}
