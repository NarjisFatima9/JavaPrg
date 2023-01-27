/*Car class implement all Interface Vehicle functionalities */
public class Car implements Vehicle {
    int speed;
    int gear;

    // to change gear
    @Override
    public void changeGear(int newGear) {

        gear = newGear;
    }

    // to increase speed
    @Override
    public void speedUp(int increment) {

        speed = speed + increment;
    }

    // to decrease speed
    @Override
    public void applyBrakes(int decrement) {

        speed = speed - decrement;
    }

    public void display() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
    public static void main(String[] args) {

        // creating an inatance of Car
        // doing some operations
        Car car = new Car();
        car.changeGear(4);
        car.speedUp(5);
        car.applyBrakes(1);

        System.out.println("Car present state :");
        car.display();
         System.out.println(num);
    }

    }
