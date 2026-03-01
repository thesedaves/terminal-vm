package terminal;

import java.util.Scanner;
import terminal.commands.*;

public class Terminal {
    private String shellPrefix = "";
    private String shellSymbol = "~";
    private final Scanner scanner = new Scanner(System.in);

    public Terminal() {}

    public void startTerminal() {
        while (true) {
            System.out.print(shellPrefix + " " + shellSymbol + " ");
            String input = scanner.nextLine().trim();
            if (input == null) {
                continue;
            } 
            Command inputCommand = Functionality.getCommand(input);
            if (inputCommand != null) {
                inputCommand.doYourStuff(Functionality.removeCmdPrefix(input));
            }
        }
    }

    public void setShellPrefix(String prefix) {
        this.shellPrefix = prefix;
    }

    public void setShellSymbol(String symbol) {
        this.shellSymbol = symbol;
    }
}