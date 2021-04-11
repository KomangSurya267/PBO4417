public class UjiKendaraan {
    static void Kendaraan(Vehicle vehicle) {
        vehicle.goStraight();
    }
    public static void main(String[] args) {
        Bicycle sepeda = new Bicycle();
        Motorvehicle mesin = new Motorvehicle();
        Motorcycle motor = new Motorcycle();
        Car mobil = new Car();

        sepeda.ringBell();
        Kendaraan(sepeda);

        mesin.Coba();
        Kendaraan(mesin);

        motor.AturGearFoot(2);
        motor.Cek();
        Kendaraan(motor);

        mobil.AturSeatBelt(1);
        System.out.println("Sabuk Sekarang Bernilai : "+ mobil.DapatSeatBelt());
        Kendaraan(mobil);
        
        
    }
    
}