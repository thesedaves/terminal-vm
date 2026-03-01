package terminal.commands;

import java.util.ArrayList;

public final class Commands {

    public ArrayList<Command> commandList = new ArrayList<>();

    public static final Command echo = new Command("echo",(String text) -> {
        System.out.println(text);
    });
    public static final Command ls = new Command("ls",(String argument) -> {

    });

    public Commands() {
        loadCommands();
    }

    public void loadCommands() {
        commandList.add(echo);
        commandList.add(ls);
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