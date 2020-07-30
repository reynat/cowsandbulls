import java.util.Scanner;

public class Reader {

    private Scanner keyboard;
    
    public Reader() {
        this.keyboard = new Scanner(System.in);
    }

    public Secret readUserSecret() {
        String userInput = keyboard.nextLine();
        Secret guess = new Secret(userInput);

        return guess;
    }

    public void stop() {
        keyboard.close();
    }
}