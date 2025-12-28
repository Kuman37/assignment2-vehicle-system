public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Gennady Crocodile", "DL00001");
        Driver driver2 = new Driver("Peter Parker", "DL00002");

        Car myCar = new Car("Toyota", 2018, 4, "Gasoline");
        Motorcycle myBike = new Motorcycle("Honda", 2020, false);
        Truck myTruck = new Truck("Kamaz", 2023, 15.5, 3);

        myCar.setDriver(driver1);
        myBike.setDriver(driver2);
        myTruck.setDriver(driver1);

        Vehicle[] fleet = {myCar, myBike, myTruck};

        System.out.println("----------------------------------------------");
        for (Vehicle vehicle : fleet) {
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.displayDriver();
            vehicle.stopEngine();
            System.out.println("----------------------------------------------");
        }
    }
}