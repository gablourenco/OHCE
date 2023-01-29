import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String lang = System.getProperty("user.country");

        Scanner scan = new Scanner(System.in);

        System.out.print("Bonjour, Entrez une chaîne de caractères : ");

        String chaine = scan.nextLine();

        String inverse = new StringBuilder(chaine).reverse().toString();

        if (lang == "FR" || chaine.equalsIgnoreCase(inverse) && chaine != "") {
            System.out.println("Bien joué ! La chaîne '"+chaine+"' est un palindrome.");
        } else if(lang == "FR" || !chaine.equalsIgnoreCase(inverse)){
            System.out.println("Désolé, la chaîne '"+chaine+"' n'est pas un palindrome.");
        } else if(lang == "EN" || chaine.equalsIgnoreCase(inverse) && chaine != "") {
            System.out.println("Well done '"+chaine+"' is palindrome.");
        } else if(lang == "EN" || !chaine.equalsIgnoreCase(inverse)) {
            System.out.println("Sorry '"+chaine+"' is not palindrome.");
        };
        System.out.print(lang);
        if(lang == "EN"){
            System.out.print(" Good bye");
        } else{
            System.out.print(" Au revoir");
        }
        scan.close();
    }
}