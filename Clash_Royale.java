import java.util.Scanner;

public class Clash_Royale_Player_Indicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter total number of wins (W): ");
        double W = scanner.nextDouble();
        
        System.out.println("Enter total trophies (T): ");
        double T = scanner.nextDouble();
        
        System.out.println("Enter arena number (A): ");
        double A = scanner.nextDouble();
        
        // Calculate L using the formula L = (W*30-T)/30
        double L = (W * 30 - T) / 30;
        
        // Calculate x using the formula x = (W/(W+L) + T/100)*A
        double x = (W / (W + L) + T / 100) * A;
        
        // Display the result
        System.out.print("Your score is", x);
        
        scanner.close();
    }
}