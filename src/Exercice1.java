import java.util.Scanner;

public class Exercice1 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Time Taken by Worker : ");
        int time = scanner.nextInt();

        if (time >= 2 && time <= 3) {
            System.out.println("Highly efficient");
        } else if (time == 4) {
            System.out.println("You need to improve speed");
        } else if (time == 5) {
            System.out.println("You have to training to improve your speed");
        } else {
            System.out.println("You have to leave the company.");
        }
    }
}
