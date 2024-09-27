import java.util.*;

class StaticGenericMethod{
// Defining a static generic method to print any datatype
  static <T> void genericPrint2(T t){
//The following statement print which type parameter T this method is handling
    System.out.println(t.getClass().getName()+":"+t);
}
  public static void main(String[] args){
    genericPrint2(10);     //calling generic method with integer argument 
    genericPrint2("Joy with Java"); // Calling generic method with string argument
    genericPrint2(3.1412343); // Calling generic method with double argument 
    
  }
}
   
