/* Java program for Access Modifier
Types Of Access Modifiers In Java
Default Access Specifiers
Public Access Modifier
Protected Access Specifier
Private Access Modifier
User: Narjis Fatima
Date 1/27/2023
 Pro*/

 class PrfAccessModifiers {

          void defaultDisplay()      //no access modifier indicates default modifier
    {
        System.out.println("Display with 'dafault' scope");
    }

     public void publicDisplay()  //Public Access Modifier
     {
         System.out.println("Display with 'Public' scope");
     }

     protected void protectedDisplay() //Protected Modifier
     {
         System.out.println("The protected access modifier is usually used in parent-child relationships.");
     }

 }
