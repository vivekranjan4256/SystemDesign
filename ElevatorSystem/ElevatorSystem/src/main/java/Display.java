public class Display {
    int floor;
    Direction direction;
    public void setDisplay(int floor, Direction direction){
        this.direction=direction;
        this.floor=floor;
    }
    public void showDisplay(){
        System.out.println("Floor: " + floor);
        System.out.println("Direction: " + direction);
    }
}
