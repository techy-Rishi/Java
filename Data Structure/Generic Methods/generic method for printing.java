class printgen {
    // Defining a generic method to print any data type
   <T> void genericPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        // Creating an object of the class printgen
        printgen aObj = new printgen();

        // Calling the generic method with different types of arguments
        aObj.genericPrint(101);               // int argument
        aObj.genericPrint("Joy with Java");   // String argument
        aObj.genericPrint(3.1412343);         // double argument
    }
}
