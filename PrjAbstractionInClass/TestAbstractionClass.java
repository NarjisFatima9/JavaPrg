/*Java Progra creating TestABstractionClass class to  test abstraction in  class
* User: Narjis Fatima*/
public class TestAbstractionClass {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red ", 2.2);
        Shape s2 = new Rectangles("Yellow ", 2, 4);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
