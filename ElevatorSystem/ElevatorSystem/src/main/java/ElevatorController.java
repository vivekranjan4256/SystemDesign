import java.util.Collections;
import java.util.PriorityQueue;

public class ElevatorController {
    ElevatorCar elevatorCar;
    PriorityQueue<Integer> upMinPQ;
    PriorityQueue<Integer> downMaxPQ;
    public ElevatorController(ElevatorCar elevatorCar){
        this.elevatorCar=elevatorCar;
        upMinPQ = new PriorityQueue<>();
        downMaxPQ = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void submitExternalRequest(int floor, Direction direction){
        if(direction == Direction.DOWN){
            downMaxPQ.add(floor);
        }
        else{
            upMinPQ.add(floor);
        }
    };
    public void submitInternalRequest(int floor){
    }
    public void controlElevatorCar(){
        while(true){
            if(elevatorCar.elevatorDirection == Direction.UP){

            }
        }
    };
}
