package state;

public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter.");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter.");
    }

    @Override
    public void turnCrank() {
        System.out.println("you turned, but there is no quarter.");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay first.");
    }
}
