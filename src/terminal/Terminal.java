package terminal;

import java.util.Scanner;
import terminal.commands.*;

public class Terminal {
    private static String shellPrefix = "";
    private static String shellSymbol = "~";
    private final Scanner scanner = new Scanner(System.in);

    public Terminal() {}

    public void startTerminal() {
        while (true) {
            System.out.print(shellPrefix + " " + shellSymbol + " ");
            String input = scanner.nextLine().trim();
            if (input == null) {
                continue;
            } 
            try {
                Command inputCommand = Functionality.getCommand(input);
                if (inputCommand != null) {
                inputCommand.doYourStuff(Functionality.removeCmdPrefix(input));
                }
            } catch (Exception e){}
        }
    }


    public static void setShellPrefix(String prefix) {
        shellPrefix = prefix;
    }

    public static void setShellSymbol(String symbol) {
        shellSymbol = symbol;
    }
}