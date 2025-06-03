public class Parking {
    private int[] empty;  
    public Parking(int big, int medium, int small) {
        this.empty = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        if (empty[carType - 1] > 0) {
            empty[carType - 1]--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Parking parking = new Parking(1, 1, 0);
        System.out.println(parking.addCar(1)); // true
        System.out.println(parking.addCar(2)); // true
        System.out.println(parking.addCar(3)); // false
        System.out.println(parking.addCar(1)); // false
    }
}
