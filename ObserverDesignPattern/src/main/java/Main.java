import DisplayObserver.DisplayObserverInterface;
import DisplayObserver.MobileObserver;
import DisplayObserver.TVObserver;
import WSObservable.WSObservableImpl;
import WSObservable.WSObservableInterface;

public class Main {
    public static void main(String[] args) {

        WSObservableInterface weatherStation = new WSObservableImpl();

        DisplayObserverInterface observer1 = new TVObserver(weatherStation);
        DisplayObserverInterface observer2 = new MobileObserver(weatherStation);

        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);

        weatherStation.setData(15);
        weatherStation.setData(30);

    }
}
