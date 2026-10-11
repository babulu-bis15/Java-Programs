class Vehicle {
    String make;
    String model;
    double fuel;

    Vehicle(String make, String model, double fuel) {
        this.make = make;
        this.model = model;
        this.fuel = fuel;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency calculation");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled");
    }

    void maxSpeed() {
        System.out.println("Maximum speed");
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Truck fuel efficiency: 8 km/l");
    }

    void distanceTravelled() {
        System.out.println("Truck distance: 400 km");
    }

    void maxSpeed() {
        System.out.println("Truck maximum speed: 100 km/h");
    }
}

class Car extends Vehicle {

    Car(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Car fuel efficiency: 18 km/l");
    }

    void distanceTravelled() {
        System.out.println("Car distance: 500 km");
    }

    void maxSpeed() {
        System.out.println("Car maximum speed: 180 km/h");
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, double fuel) {
        super(make, model, fuel);
    }

    void fuelEfficiency() {
        System.out.println("Motorcycle fuel efficiency: 45 km/l");
    }

    void distanceTravelled() {
        System.out.println("Motorcycle distance: 300 km");
    }

    void maxSpeed() {
        System.out.println("Motorcycle maximum speed: 120 km/h");
    }
}

class Main {
    public static void main(String[] args) {

        Car c = new Car("Maruti", "Swift", 30);

        System.out.println(c.make);
        System.out.println(c.model);

        c.fuelEfficiency();
        c.distanceTravelled();
        c.maxSpeed();
    }
}