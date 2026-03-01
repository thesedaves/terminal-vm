package terminal.commands;

import java.util.ArrayList;

public class Commands {

    public ArrayList<Command> commandList = new ArrayList<>();

    public static final Command echo = (String argument) -> {
        System.out.println(argument);
    };


}