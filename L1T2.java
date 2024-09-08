import java.util.Scanner;

public class L1T2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("F: ");
        int f = input.nextInt(); 
        double c = (5.0 / 9) * (f - 32);
        System.out.println("C: " + c); 
    }
}
