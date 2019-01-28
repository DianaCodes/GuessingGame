import java.util.Scanner;

public class GuessGame {
    public static void main (String[] args) {
        Scanner reader = new Scanner(System.in);

        boolean x = true;

        while(true) {
            System.out.println("Make a guess: ");
            String n = reader.next();

            if(n.equals("quit")) {
                break;
            }

            System.out.println("You guessed: " + n);
        }
    }
}
