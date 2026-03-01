import java.util.Scanner;
import terminal.commands.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String input;
        while (true) {
            System.out.print("> ");
            input = scan.nextLine();
            if (input.startsWith("echo ")) {
                input = (String) input.subSequence(5, input.length());
                Commands.echo.doYourStuff(input);
            }
        }
    }
}