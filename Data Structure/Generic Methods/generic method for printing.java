class printgen{
  // Defining a generic method to print any data type
  void genericPrint(T t){
    System.out.println(t);
  }
  public static void main(String[] args){
    printgen aObj; // creating an object of the class printgen
    aObj.genericPrint(101); // Calling generic method with int argument
    aObj.genericPrint("Joy with java"); // calling generic method with string
    aObj.genericPrint(3.1412343); // calling generic method with double
  }
}  
