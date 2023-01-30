/*Java program to usage keyword static. Static method and variable called without creating object.Static Keyword use
*as Block, Nested class
* User Narjis Fatima
* Date 1/27/2023*/
public class UseOfStaticKeyword {
    // Static Variable
    static int Num;
    static void display() {
        System.out.println("Static variable is: " + Num);
    }

        // Static method
        static void methodWithStatic() {
        Num=100;
        display();
            System.out.println("Static methods can be called without creating objects");
        }

        // Public method
        public void methodWithPublic() {
            System.out.println("Public methods must be called by creating objects");
        }

        // Main method
        public static void main(String[] args) {
            methodWithStatic(); // Call the static method

            UseOfStaticKeyword myObj = new UseOfStaticKeyword(); // Create an object of MyClass
            myObj.methodWithPublic(); // Call the public method
        }
    }


