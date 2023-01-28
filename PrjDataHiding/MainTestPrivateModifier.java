/* Java Program to access private member variables  using getters and setters
* User Narjis Fatima
* Date 1/27/2023*/

public class MainTestPrivateModifier {

    public static void main(String[] main){
        PrgPrivateModifier myobj = new PrgPrivateModifier();

        // access the private variable using the getter and setter
        myobj.setName("Private modifier scope");
        System.out.println(myobj.getName());
    }
}
