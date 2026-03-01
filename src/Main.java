import java.util.Scanner;
import terminal.commands.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("> ");
            input = scan.nextLine();
            if (input.equals("echo")) Commands.echo.doYourStuff(input);
        }
    }
}