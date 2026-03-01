package terminal;

import terminal.commands.*;

public class Functionality {

    private static String removeCmdPrefix(String input) {
        input = input.substring(input.indexOf(" "), input.length()).strip();
        return input;
    }
    private static Command getCommand(String input) {
        Commands cmds = new Commands();
        return cmds.getCommand(input);
    }
    public 
}