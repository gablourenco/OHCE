import static org.junit.Assert.assertEquals;

import java.util.Scanner;
import org.junit.Test;
import java.time.LocalTime;

public class MainTest {
    @Test
    public void testPalindrome(String[] args) {
        // ETANT DONNER un utilisateur qui entre une chaine de caractère dans la console
        Scanner scan = new Scanner(System.in);
        String chaine = scan.nextLine();

        // QUAND on entre un palindrome
        chaine = "did";
        String inverse = new StringBuilder(chaine).reverse().toString();

        //ALORS le palindrome est renvoyé et bien dit est renvoyé
        System.out.println("'"+inverse+"' Bien dit !");
    }
    public void testLang(String[] args){
        // ETANT DONNER la langue de l'ordinateur de l'utilisateur
        String lang = System.getProperty("user.country");

        // QUAND on entre un palindrome
        String chaine = "did";
        String inverse = new StringBuilder(chaine).reverse().toString();

        //ALORS le palindrome est renvoyé et bien dit est renvoyé en fonction de la langue de la machine
        lang = System.getProperty("user.country");
        if(lang == "FR" || chaine.equalsIgnoreCase(inverse) && chaine != "") {
            System.out.println("Bien joué ! La chaîne '"+chaine+"' est un palindrome.");
        } else {
            System.out.println("Well done '"+chaine+"' est un palindrome.");
        }
    }
    public void testPeriodBonjour(String[] args){
        // ETANT DONNER une heure locale de la machine
        LocalTime now = LocalTime.now();

        // QUAND on donne des horraires à des périodes
        LocalTime morningStart = LocalTime.of(05, 00);
        LocalTime morningEnd = LocalTime.of(11, 00);
        LocalTime afternoonStart = LocalTime.of(11, 00);
        LocalTime afternoonEnd = LocalTime.of(18, 00);
        LocalTime nightStart = LocalTime.of(11, 00);
        LocalTime nightEnd = LocalTime.of(18, 00);

        //ALORS bonjour dans la période de la machine locale est renvoyé
        if(now.isAfter(morningStart) || now.isBefore(morningEnd)) {
            System.out.print("Bonjour");
        } else if(now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print("bonne aprem");
        } else if(now.isAfter(nightStart) || now.isBefore(nightEnd)){
            System.out.print("bonsoir");
        }
    }
    public void testPeriodAuRevoir(String[] args){
        // ETANT DONNER une heure locale de la machine
        LocalTime now = LocalTime.now();

        // QUAND on donne des horraires à des périodes
        LocalTime morningStart = LocalTime.of(05, 00);
        LocalTime morningEnd = LocalTime.of(11, 00);
        LocalTime afternoonStart = LocalTime.of(11, 00);
        LocalTime afternoonEnd = LocalTime.of(18, 00);
        LocalTime nightStart = LocalTime.of(11, 00);
        LocalTime nightEnd = LocalTime.of(18, 00);

        //ALORS au revoir selon la période de la machine locale est renvoyé
        if(now.isAfter(morningStart) || now.isBefore(morningEnd)){
            System.out.print(" Bonne journée");
        } else if (now.isAfter(afternoonStart) || now.isBefore(afternoonEnd)) {
            System.out.print(" Bonne aprem");
        }  else if (now.isAfter(nightStart) || now.isBefore(nightEnd)) {
            System.out.print(" Bonne nuit");
        }
    }
    public void testBonjourPeriodLang(String[] args){
        // ETANT DONNER une heure locale et une langue locale définie pas la machine 
        LocalTime now = LocalTime.now();
        String lang = System.getProperty("user.country");

        // QUAND on donne des horraires à des périodes
        LocalTime morningStart = LocalTime.of(05, 00);
        LocalTime morningEnd = LocalTime.of(11, 00);
        LocalTime afternoonStart = LocalTime.of(11, 00);
        LocalTime afternoonEnd = LocalTime.of(18, 00);
        LocalTime nightStart = LocalTime.of(11, 00);
        LocalTime nightEnd = LocalTime.of(18, 00);

        //ALORS bonjour dans la période et dans la langue de la machine locale est renvoyé
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
    }
    public void testAurevoirPeriodLang(String[] args){
        // ETANT DONNER une heure locale et une langue locale définie pas la machine 
        LocalTime now = LocalTime.now();
        String lang = System.getProperty("user.country");

        // QUAND on donne des horraires à des périodes
        LocalTime morningStart = LocalTime.of(05, 00);
        LocalTime morningEnd = LocalTime.of(11, 00);
        LocalTime afternoonStart = LocalTime.of(11, 00);
        LocalTime afternoonEnd = LocalTime.of(18, 00);
        LocalTime nightStart = LocalTime.of(11, 00);
        LocalTime nightEnd = LocalTime.of(18, 00);

        //ALORS au revoir dans la période et dans la langue de la machine locale est renvoyé
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
    }
}