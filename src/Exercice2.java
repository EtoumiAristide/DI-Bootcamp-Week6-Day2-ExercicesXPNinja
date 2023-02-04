import java.util.Scanner;

public class Exercice2 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrer la valeur de a: ");
        int a = scanner.nextInt();

        System.out.println("Entrer la valeur de b: ");
        int b = scanner.nextInt();

        System.out.println("Entrer la valeur de c: ");
        int c = scanner.nextInt();

        double discriminant = (b * b) - 4 * a * c;

        if (discriminant > 0) {
            System.out.println("L'équation a deux(2) solutions");
        } else if (discriminant == 0) {
            System.out.println("L'équation a une(1) solution");
        } else {
            System.out.println("L'équation n'a pas de solution");
        }
    }
}
