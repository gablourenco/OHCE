import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;
import Main.Main;

public class MainTest {
    @Test
    public void testPalindrome(String[] args) {
        // ETANT DONNER un utilisateur qui entre une chaine de caractère dans la console
        Scanner scan = new Scanner(System.in);
        String chaine = scan.nextLine();

        // QUAND on entre un palindrome
        String chaine = "did";
        String inverse = new StringBuilder(chaine).reverse().toString();

        //ALORS le palindrome est renvoyé et bien dit est renvoyé
        System.out.println("'"+inverse+"' Bien dit !");
    }
}