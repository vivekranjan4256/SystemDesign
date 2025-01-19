public class ExternalButton {
    ExternalButtonDispatcher externalButtonDispatcher;
    public ExternalButton(ExternalButtonDispatcher externalButtonDispatcher){
        this.externalButtonDispatcher=externalButtonDispatcher;
    }
    public void pressButton(int floor, Direction direction){};
}
