package observer;


import java.util.Vector;

public class BaseObservable implements Observable {
    private boolean changed = false;
    private Vector<Observer> observers;

    public BaseObservable(){
        observers = new Vector<>();
    }


    public boolean hasChanged() {
        return changed;
    }

    public void setChanged() {
        changed = true;
    }

    public void clearChange() {
        changed = false;
    }

    public void registerObserver(Observer observer) {
        if(observer == null){
            throw new NullPointerException();
        }
        observers.addElement(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        Object[] arrLocal;
        synchronized (this){
            if(!hasChanged())
                return;
            arrLocal = observers.toArray();
            clearChange();
        }
        for (Object o : arrLocal) ((Observer) o).update(arg);
    }
}
