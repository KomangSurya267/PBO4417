package transportasi;

public class Mobil{
    double speed = 0;
    String color = "Orange";

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