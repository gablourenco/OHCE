import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Bonjour, Entrez une chaîne de caractères : ");

        String chaine = scan.nextLine();

        String inverse = new StringBuilder(chaine).reverse().toString();

        if (chaine.equalsIgnoreCase(inverse) && chaine != "" ) {
            System.out.println("Bien joué ! La chaîne '"+chaine+"' est un palindrome.");
        } else {
            System.out.println("Désolé, la chaîne '"+chaine+"' n'est pas un palindrome.");
        }

        System.out.print("Au revoir");
        scan.close();
    }
}