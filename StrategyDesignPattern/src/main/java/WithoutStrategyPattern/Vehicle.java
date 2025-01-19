package WithoutStrategyPattern;

//drive method with the sport capability is inherited by both sports vehicle and off-road vehicle which is a duplication of code.

public class Vehicle {
    public void drive(){
        System.out.println("Normal Drive Capability");
    }
}
