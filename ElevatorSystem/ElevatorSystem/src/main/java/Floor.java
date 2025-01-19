public class Floor {
    int floorId;
    ExternalButtonDispatcher externalButtonDispatcher;
    public Floor(int floorId){
        this.floorId=floorId;
        this.externalButtonDispatcher = new ExternalButtonDispatcher();
    }
    public void pressButton(Direction direction){
        externalButtonDispatcher.submitExternalRequest(floorId, direction);
    }
}
