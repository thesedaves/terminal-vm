package terminal;

import terminal.commands.*;

public class Functionality {

    protected static String removeCmdPrefix(String input) {
        input = input.substring(input.indexOf(" "), input.length()).strip();
        return input;
    }
    protected static Command getCommand(String input) {
        Commands cmds = new Commands();
        return cmds.getCommand(input);
    }
}