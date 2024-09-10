import java.util.Scanner;

public class L3T1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        int count = 0;
        String[] names = new String[num];

        while (count < num) {
            System.out.print("Enter name & score: ");
            String name = input.nextLine();
           
            names[count] = name;
            count++;
            
        }

        String max = 0;

        for (int i = 1; i < num; i++) {
            if (names[i].charAt(names[i].length()-2 + names[i].length()-1) > max) {
                max = names[i];
            }
        }

        System.out.println("highest score: " + max);
    }
}
