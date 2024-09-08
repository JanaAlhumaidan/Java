import java.util.Scanner;

public class L2T3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[3];
        int count = 0;

        while (count < 3) {
            System.out.print("Enter a non-empty name: ");
            String name = input.nextLine().trim();
            
            if (name.isEmpty()) {
                System.out.println("Empty name entered. Please enter a non-empty name.");
            } else {
                names[count] = name;
                count++;
            }
        }

        String longest = names[0];
        String shortest = names[0];

        for (int i = 1; i < names.length; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
            if (names[i].length() < shortest.length()) {
                shortest = names[i];
            }
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Shortest name: " + shortest);
    }
}