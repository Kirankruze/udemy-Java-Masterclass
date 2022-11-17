public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    
    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
        engine=true;
        wheels=4;
    }
    public  String startEngine(){
        return "Car -> the car's engine is starting";
    }
    public String accelerate(){
        return "Car ->the car is accelerating";
    }
    public String brake(){
        return "Car ->the car is braking";
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }

}
