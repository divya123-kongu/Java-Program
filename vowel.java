import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = s.next().charAt(0);
        
        ch = Character.toLowerCase(ch);
        
        if (ch >= 'a' && ch <= 'z') {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a Vowel");

            } 
            else {

                System.out.println(ch + " is a Consonant");
            }
        } 
        else 
        {
            System.out.println("Invalid input")
    }
}