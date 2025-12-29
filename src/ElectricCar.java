public class ElectricCar extends Car{
    private double batteryCapacity;

    public ElectricCar(String brand, int year, int doors, double batteryCapacity) {
        super(brand, year, doors, "Electric");
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Elektro on. (Battery " + batteryCapacity + "kWh)");
    }

    @Override
    public void stopEngine() {
        System.out.println("Elektro off.");
    }
}
