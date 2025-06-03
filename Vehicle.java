// Vehicle.java
class Vehicle {
    String name;
    int year;
    Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year: " + year);
    }
}
class Car extends Vehicle {
    Car(String name, int year) {
        super(name, year);
    }
}
class Truck extends Vehicle {
    Truck(String name, int year) {
        super(name, year);
    }
}
class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        Truck truck = new Truck("Ford", 2018);
        System.out.println("Car Info:");
        car.showInfo();
        System.out.println("\nTruck Info:");
        truck.showInfo();
    }
}

