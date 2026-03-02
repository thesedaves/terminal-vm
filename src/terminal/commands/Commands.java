package terminal.commands;

import java.util.ArrayList;
import terminal.*;

public final class Commands {

    public ArrayList<Command> commandList = new ArrayList<>();

    public static final Command echo = new Command("echo",(String text) -> {
        System.out.println(text);
    });
    public static final Command ls = new Command("ls",(String argument) -> {

    });
    public static final Command cd = new Command("cd",(String path) -> {

    });
    public static final Command setshellsymbol = new Command("setshellsymbol",(String symbol) -> { 
        Terminal.setShellSymbol(symbol);
    });

    public Commands() {
        loadCommands();
    }

    public void loadCommands() {
        commandList.add(echo);
        commandList.add(ls);
        commandList.add(cd);
        commandList.add(setshellsymbol);
    }

    public Command getCommand(String input) {
        String cmd = input.substring(0, input.indexOf(" "));
        for (Command command: commandList) {
            if (command.getName().equals(cmd)) {
                return command;
            }
        }
        return null;
    }
}