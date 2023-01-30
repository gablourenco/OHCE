// Permet d'utiliser les fonctions java native
import java.util.Scanner;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Permet d'obtenir l'heure actuelle de la machine
        LocalTime now = LocalTime.now();

        // Je crée des périodes
        LocalTime morningStart = LocalTime.of(05, 00);
        LocalTime morningEnd = LocalTime.of(11, 00);
        LocalTime afternoonStart = LocalTime.of(11, 00);
        LocalTime afternoonEnd = LocalTime.of(18, 00);
        LocalTime nightStart = LocalTime.of(11, 00);
        LocalTime nightEnd = LocalTime.of(18, 00);

        // Sert à connaitre la localisation de la machine grâce à cele je peux crée des conditions
        String lang = System.getProperty("user.country");

        // Mes conditions afin de renvoyer une salutations en fonction du moment de la journée et de l'heure de la machine
        if(lang == "FR" || now.isAfter(morningStart) || now.isBefore(morningEnd)) {
            System.out.print("Bonjour");
        } else if(lang == "EN" || now.isAfter(morningStart) || now.isBefore(morningEnd)){
            System.out.print("good morning");
        } else if(lang == "FR" || now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print("bonne aprem");
        } else if(lang == "EN" || now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print("Good afternoon");
        } else if(lang == "FR" || now.isAfter(nightStart) || now.isBefore(nightEnd)) {
            System.out.print("bonsoir");
        } else if(lang == "EN" || now.isAfter(nightStart) || now.isBefore(nightEnd)){
            System.out.print("Good night");
        }

        // Permet à l'utilisateur de rentrer une chaine de caractères
        System.out.print(" Entrez une chaîne de caractères : ");

        // Permet de lire la chaine de caractères et de la stocker dans la variable chaine
        String chaine = scan.nextLine();

        // Permet d'inverser la chaine de caractères stockée
        String inverse = new StringBuilder(chaine).reverse().toString();
        
        // Mes conditions qui permette de savoir si la chaine de caractère 
        // est un palindrome et de l'annoncer selon la langue de la machine
        if (lang == "FR" || chaine.equalsIgnoreCase(inverse) && chaine != "") {
            System.out.println("Bien joué ! La chaîne '"+chaine+"' est un palindrome.");
        } else if(lang == "FR" || !chaine.equalsIgnoreCase(inverse)){
            System.out.println("Désolé, la chaîne '"+chaine+"' n'est pas un palindrome.");
        } else if(lang == "EN" || chaine.equalsIgnoreCase(inverse) && chaine != "") {
            System.out.println("Well done '"+chaine+"' is palindrome.");
        } else if(lang == "EN" || !chaine.equalsIgnoreCase(inverse)) {
            System.out.println("Sorry '"+chaine+"' is not palindrome.");
        };

        // Mes conditions qui permette de dire au revoir 
        // selon la période de la journée et selon la langue de la machine
        if(lang == "FR" || now.isAfter(morningStart) || now.isBefore(morningEnd)){
            System.out.print(" Bonne journée");
        } else if (lang == "EN" || now.isAfter(morningStart) || now.isBefore(morningEnd)){
            System.out.print(" Have a good day");
        } else if (lang == "FR" || now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print(" Bonne aprem");
        } else if (lang == "EN" || now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print(" Have a good afternoon");
        } else if (lang == "FR" || now.isAfter(nightStart) || now.isBefore(nightEnd)) {
            System.out.print(" Bonne nuit");
        } else if (lang == "EN" || now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print(" Have a good night");
        }

        // Permet de terminer le scan
        scan.close();
    }
}