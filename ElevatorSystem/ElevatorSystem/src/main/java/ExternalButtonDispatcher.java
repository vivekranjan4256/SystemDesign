import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllers = ElevatorCreator.elevatorControllerList;
    public void submitExternalRequest(int floor, Direction direction){
        //applying odd even for getting the lift
        for(ElevatorController elevatorController : ElevatorCreator.elevatorControllerList){
            int elevatorId = elevatorController.elevatorCar.elevatorId;
            if(elevatorId%2==1 && floor%2==1){
                elevatorController.submitExternalRequest(floor, direction);
            }
            else if(elevatorId%2==0 && floor%2==0){
                elevatorController.submitExternalRequest(floor, direction);
            }
        }
    };
}
