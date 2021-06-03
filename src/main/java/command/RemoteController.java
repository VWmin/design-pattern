package command;


public class RemoteController {
    private Command[] onCommand;
    private Command[] offCommand;

    private Command undoCommand;

    public RemoteController(){
        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0; i<7; i++){
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command noCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = noCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommand[slot].execute();
        undoCommand = onCommand[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommand[slot].execute();
        undoCommand = offCommand[slot];
    }

    public void undoButtonWasPressed(int slot){
        undoCommand.undo();
    }


}
