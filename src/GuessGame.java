import java.util.Scanner;

public class GuessGame {
    public static void main (String[] args) {
        int val = 20;
        int count = 0;

        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.println("Make a guess: ");
            String n = reader.next();

            int foo = Integer.parseInt(n);

            if(foo>val) {
                System.out.println("Too high");
                System.out.println("Number of times correct: " + count);
            } else if (foo<val) {
                System.out.println("Too low");
                System.out.println("Number of times correct: " + count);
            } else if (foo==val) {
                System.out.println("You guessed right!");
                count++;
                System.out.println("Number of times correct: " + count);
            }

            if(n.equals("quit")) {
                break;
            }

            System.out.println("You guessed: " + n);
        }
    }
}
