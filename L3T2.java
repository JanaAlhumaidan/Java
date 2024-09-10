import java.util.Scanner;

public class L3T2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First Name: ");
        String first = input.nextLine(); 

        System.out.print("Middle Name: ");
        String mid = input.nextLine(); 

        System.out.print("Last Name: ");
        String last = input.nextLine(); 

        System.out.print("Age: ");
        int age = input.nextInt(); 

        char firstchar = first.length() > 0 ? first.charAt(0) : ' ';
        char midchar = mid.length() > 0 ? mid.charAt(1) : ' ';
        char lastIchar = last.length() > 0 ? last.charAt(last.length()-1) : ' ';

        System.out.println("Your password = " + Character.toUpperCase(firstchar) + Character.toUpperCase(midchar) + Character.toUpperCase(lastIchar) + age + "00");
    }
}
