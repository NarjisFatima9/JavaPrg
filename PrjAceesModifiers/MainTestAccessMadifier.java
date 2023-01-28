public class MainTestAccessMadifier {
    public static void main(String args[])
    {
        //access class with default scope
        PrfAccessModifiers obj = new PrfAccessModifiers();


        obj.defaultDisplay();    //access class method with default scope


        obj.publicDisplay();    //access class method with public scope


       // obj.setStr1("Private mofifier scope ,to access private member variables  using getters and setters ");
        //System.out.println(obj.getStr1()); // access class method with private scope


        //create object of class ChildClassForProtectedMod1
        ChildClassForProtectedMod1 obj1 = new ChildClassForProtectedMod1();
        obj1.protectedDisplay();       //access class PrfAccessModifiers protected method using obj
    }
}
