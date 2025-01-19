package WSObservable;

import DisplayObserver.DisplayObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class WSObservableImpl implements WSObservableInterface{

    List<DisplayObserverInterface> observerList = new ArrayList<>();
    int currentTemp = 0;

    @Override
    public void addObserver(DisplayObserverInterface obj) {
        observerList.add(obj);
    }

    public void removeObserver(DisplayObserverInterface obj){
        observerList.remove(obj);
    }

    public void notifyObservers(){
        for(DisplayObserverInterface displayObj: observerList){
            displayObj.update();
        }
    }

    public void setData(int newTemp){
        currentTemp = newTemp;
        notifyObservers();
    }

    public int getData(){
        return currentTemp;
    }
}
