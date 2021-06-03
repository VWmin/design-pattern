package command;

import command.light.Light;
import command.light.LightOnCommand;

//Client
public class Test {
    public static void main(String[] args) {
        //invoker
        SimpleRemoteController lightController = new SimpleRemoteController();

        //Receiver
        Light light = new Light();

        //ConcreteCommand
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        lightController.setCommand(lightOnCommand);
        lightController.buttonWasPressed();
    }
}
