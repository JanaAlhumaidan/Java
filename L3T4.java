import java.util.Scanner;

public class L3T4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a string: ");
        String string = input.nextLine();

        int found = 1;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ' || string.charAt(i) == 'M') {
                found++;
                continue;
            } else {
                continue;
            }
        }
        System.out.print("number of words: " + found);
    }
}
