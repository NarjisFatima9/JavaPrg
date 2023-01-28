/*Java program to demostrate private modifier
the methods and fields that are declared as private are not accessible outside the class
to access private member variables. This method is using getters and setters*/

public class PrgPrivateModifier {

        private String name;

        // getter method
        public String getName() {
            return this.name;
        }
        // setter method
        public void setName(String newname) {
            this.name= newname ;
        }

    }

