import java.util.Scanner;

public class Carburant {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Votre voiture consomme combien d'euros? ( Exemple : 0,32) :");
        double somme = scanner.nextDouble();

        System.out.print("Vous avez conduit combien de kilometres ? :");

        int km = scanner.nextInt();

        System.out.println("La totalité payée :" + somme * km + " euro");

    }
}
