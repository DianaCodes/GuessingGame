import java.util.Scanner;

public class GuessGame {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Make a guess: ");

        String n = reader.next();
        reader.close();
        System.out.println("You guessed: " + n);
    }
}
