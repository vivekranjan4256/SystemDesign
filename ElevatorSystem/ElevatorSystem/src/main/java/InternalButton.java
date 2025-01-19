public class InternalButton {
    InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher();
    int[] availableButtons = {1,2,3,4,5,6,7,8,9,10};
    int buttonSelected;
    public void pressButton(int destination, ElevatorCar eLevatorCar){
        internalButtonDispatcher.submitInternalRequest(destination, eLevatorCar);
    };

}
