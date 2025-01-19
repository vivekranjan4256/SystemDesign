import java.util.List;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllers = ElevatorCreator.elevatorControllerList;
    public void submitInternalRequest(int floor, ElevatorCar elevatorCar){};
}
