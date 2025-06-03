public class Vehicle {
    private String type;
    private double fuel;

    public Vehicle() {
        this.type = "Generic Vehicle";
        this.fuel = 0.0;
    }
    public void move() {
        if (fuel > 0) {
            System.out.println(type + " is moving...");
            fuel -= 1.0;
        } else {
            System.out.println(type + " can't move. No fuel.");
        }
    }
    public void refuel(double amount) {
        if (amount > 0) {
            fuel += amount;
            System.out.println("Refueled " + amount + " liters. Current fuel: " + fuel);
        } else {
            System.out.println("Invalid fuel amount.");
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.move();            
        v.refuel(5.0);       
        v.move();            
        v.move();            
    }
}
