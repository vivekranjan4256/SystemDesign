public class ElevatorCar {
    int elevatorId;
    Display display;
    int currentFloor;
    Direction elevatorDirection;
    Status elevatorStatus;
    InternalButton internalButton;
    ElevatorDoor elevatorDoor;

    public ElevatorCar(){
        display = new Display();
        internalButton = new InternalButton();
        elevatorStatus = Status.IDLE;
        currentFloor=0;
        elevatorDirection=Direction.UP;
        elevatorDoor = new ElevatorDoor();
    }

    public void setDisplay(int currentFloor, Direction elevatorDirection){
        this.display.setDisplay(currentFloor, elevatorDirection);
    }
    public void showDisplay(){
        display.showDisplay();
    }
    public void pressButton(int destination){
        internalButton.pressButton(destination, this);
    }

    boolean moveElevator(Direction direction, int destinationFloor){
        int startFloor = currentFloor;
        if(direction == Direction.UP){
            for(int i=startFloor;i<=destinationFloor; i++){
                this.currentFloor = i;
                setDisplay(i, direction);
                showDisplay();
                if(i==destinationFloor){
                    return true;
                }
            }
        }
        if(direction == Direction.DOWN){
            for(int i=startFloor;i>=destinationFloor; i--){
                this.currentFloor = i;
                setDisplay(i, direction);
                showDisplay();
                if(i==destinationFloor){
                    return true;
                }
            }
        }
        return false;
    }
}
