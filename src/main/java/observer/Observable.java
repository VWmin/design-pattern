package observer;

public interface Observable {

    boolean hasChanged();
    void setChanged();
    void clearChange();

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
    void notifyObservers(Object arg);
}
