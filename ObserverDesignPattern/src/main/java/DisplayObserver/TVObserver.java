package DisplayObserver;

import WSObservable.WSObservableImpl;
import WSObservable.WSObservableInterface;

public class TVObserver implements DisplayObserverInterface {

        WSObservableInterface obj;

        public TVObserver(WSObservableInterface obj){
            this.obj = obj;
        }

        @Override
        public void update() {
            System.out.println("TV  temperature is:" + obj.getData());
        }
    }
