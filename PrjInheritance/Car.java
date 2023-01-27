/*Sub Class Car inherit Vehicle class*/

class Car extends Vehicle {
    private String modelName = "Camry";
    public static void main(String[] args) {
        Car myFirstCar = new Car();
        myFirstCar.wheeler();
        System.out.println(myFirstCar.brand + " " + myFirstCar.modelName);
    }

}


