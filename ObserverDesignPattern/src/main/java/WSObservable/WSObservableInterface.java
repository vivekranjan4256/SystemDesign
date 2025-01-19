package WSObservable;

import DisplayObserver.DisplayObserverInterface;

public interface WSObservableInterface {
    public void addObserver(DisplayObserverInterface obj);
    public void removeObserver(DisplayObserverInterface obj);
    public void notifyObservers();
    public void setData(int newData);
    public int getData();
}
