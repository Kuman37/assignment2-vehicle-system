public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Gennady Crocodile", "DL00001");
        Driver driver2 = new Driver("Peter Parker", "DL00002");
        Driver driver3 = new Driver("Molniya Maksimkin", "DL00003");

        Car myCar = new Car("Toyota", 2018, 4, "Gasoline");
        Motorcycle myBike = new Motorcycle("Honda", 2020, false);
        Truck myTruck = new Truck("Kamaz", 2023, 15.5, 3);
        ElectricCar myEV = new ElectricCar("Tesla", 2024, 2, 69.0);

        myCar.setDriver(driver1);
        myBike.setDriver(driver2);
        myTruck.setDriver(driver1);
        myEV.setDriver(driver3);

        Vehicle[] fleet = {myCar, myBike, myTruck, myEV};

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