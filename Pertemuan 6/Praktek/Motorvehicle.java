public class Motorvehicle extends Vehicle{
    int sizeofEngine = 1; 
    String licencePlate = "H 1 IDN";
    
    public Motorvehicle(){}
    public Motorvehicle(int sizeofEngine, String licencePlate){}
    public void Coba() {
        System.out.println(sizeofEngine);
        System.out.println(licencePlate);
    }
    public int getSizeofEngine(){
        return this.sizeofEngine;
    }
    public String getLicencePlate(){
        return this.licencePlate;
    }
}