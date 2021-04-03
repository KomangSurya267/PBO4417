public class Vehicle{
    double speed = 0;
    String color = "Orange";

    public Vehicle(){
    }
    public void goStraight(){
        System.out.println("Maju...");
    }
    public void turnLeft(){
        System.out.println("Belok Kiri...");
    }
    public void turnRight(){
        System.out.println("Belok Kanan");
    }
}
class Bicycle extends Vehicle{
    public Bicycle(){}
    public void ringBell(){
        System.out.println("Kring...Kring...");
    }
}
class Motorvehicle extends Vehicle{
    int sizeofEngine = 1; 
    String licencePlate = "H 1 IDN";
    
    public Motorvehicle(){}
    public Motorvehicle(int sizeofEngine, String licencePlate){}
    public int getSizeofEngine(){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}