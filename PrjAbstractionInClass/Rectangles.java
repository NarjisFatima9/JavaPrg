/*Java Progra creating Rectangle class to inherit  abstract shape class
* User: Narjis Fatima*/
class Rectangles extends Shape
{
    double length;
    double width;

    public Rectangles(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
                + " and area is : " + area();
    }
}
