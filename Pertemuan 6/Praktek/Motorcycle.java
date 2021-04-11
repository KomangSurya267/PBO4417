public class Motorcycle extends Motorvehicle{
    int numGear = 0;

    public Motorcycle(){}
    public void AturGearFoot(int nmGear){
        this.numGear = nmGear;
    }
    public int DapatGearFoot(){
        return numGear;
    }
    public void Cek() {
        System.out.println("Gear Dari Sepeda Sekarang Yaitu : "+numGear);

    }
}