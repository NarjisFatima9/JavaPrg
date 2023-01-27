/*
 * Java program for creating CLass and Objects
 * Creating Class ClassAndObjects and
 * Creating Obects for this class
 * Narjis Fatima
 * */

class Main {
            public static void main(String args[]){
            //create a CLassAndObjects object using new operator
            ClassAndObjects classAndObject_object = new ClassAndObjects();
            //display data members of the class.
                classAndObject_object.student_id= 100;
                classAndObject_object.student_name= "Johm" ;
                classAndObject_object.student_marks= 97.99;
            System.out.println("Student Id:" + classAndObject_object.student_id);
            System.out.println("Student Name:" + classAndObject_object.student_name);
            System.out.println("Student Marks:" + classAndObject_object.student_marks);

        }
    }


