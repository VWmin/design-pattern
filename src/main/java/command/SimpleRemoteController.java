package command;

//Invoker
public class  SimpleRemoteController {
    private Command slot;

    public SimpleRemoteController(){
        slot = new NoCommand();
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
