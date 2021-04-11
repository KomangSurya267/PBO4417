import transportasi.Mobil;
import transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args){
    Mobil Car = new Mobil();
    Bicycle Sepeda = new Bicycle();
    Car.goStraight();
    Car.turnLeft();
    Car.turnRight();
    Sepeda.ringBell();
    Sepeda.takeBrake();   
    }
}