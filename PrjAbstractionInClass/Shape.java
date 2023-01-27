/* Java program for abstraction in class
*User: Narjis Fatima
*date: 1/27/2023
*created Shape Abstract class with Astract methods
*/
    abstract class Shape {
        String color;

        // these are abstract methods
        abstract double area();
        public abstract String toString();

        // abstract class can have the constructor
        public Shape(String color)
        {
            System.out.println("Shape constructor called");
            this.color = color;
        }

        // this is a concrete method
        public String getColor() { return color; }
    }


