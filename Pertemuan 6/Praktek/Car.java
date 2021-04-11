public class Car extends Motorvehicle{
    boolean seatbelt = false;
    
    public Car(){}
    public void AturSeatBelt(int seatbelt){
        if(seatbelt == 1){
            this.seatbelt = true;
        }
        else{
            this.seatbelt = false;
        }
    }
    public boolean DapatSeatBelt(){
        return seatbelt;
    }
}