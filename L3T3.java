import java.util.Scanner;

public class L3T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a string: ");
        String string = input.nextLine();

        int found = 0;

        for (int i = 0; i < string.length(); i++) {
            if (found < 3 && (string.charAt(i) == 'm' || string.charAt(i) == 'M')) {
                found++;
                continue;
            } else {
                System.out.print(string.charAt(i));
            }
        }
    }
}
