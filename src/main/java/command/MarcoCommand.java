package command;

/**
 * 符合命令执行
 */
public class MarcoCommand implements Command {

    private Command[] commands;

    public MarcoCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command :commands){
            command.undo();
        }
    }
}
