package terminal.commands;

public class Command implements CommandInterface {
    public String name;
    CommandInterface command;

    public Command(String name, CommandInterface cmd) {
        this.name = name;
        this.command = cmd;
    }

    @Override
    public void doYourStuff(String input) {
        command.doYourStuff(input);
    }

    public String getName() {
        return name;
    }
}