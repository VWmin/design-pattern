package decorator;

public abstract class Beverage {
    protected String description = "Unknown Beverage.";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
