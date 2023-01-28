public class PrgStaticMethod {
        // Static method
        static void myStaticMethod() {
            System.out.println("Static methods can be called without creating objects");
        }

        // Public method
        public void myPublicMethod() {
            System.out.println("Public methods must be called by creating objects");
        }

        // Main method
        public static void main(String[] args) {
            myStaticMethod(); // Call the static method
            PrgStaticMethod myObj = new PrgStaticMethod(); // Create an object of PrgStaticMethod
            myObj.myPublicMethod(); // Call the public method on the object
        }
    }



