package command.light;

import command.Command;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light){
        this.light  = light ;
    }


    @Override
    public void execute() {
        light.off();
    }

    // 简单的逆转撤销
    @Override
    public void undo() {
        light.on();
    }
}
