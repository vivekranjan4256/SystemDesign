package DisplayObserver;

import WSObservable.WSObservableImpl;
import WSObservable.WSObservableInterface;

public class MobileObserver implements DisplayObserverInterface {

    WSObservableInterface obj;

    public MobileObserver(WSObservableInterface obj){
        this.obj = obj;
    }

    @Override
    public void update() {
        System.out.println("Mobile temperature is:"+ obj.getData());
    }
}
