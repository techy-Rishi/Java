class printgen<T> {
    // Defining a generic method to print any data type
    void genericPrint(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        // Creating an object of the class printgen with Object type
        printgen<Object> aObj = new printgen<>(); 

        // Calling the generic method with different types of arguments
        aObj.genericPrint(101);               // int argument
        aObj.genericPrint("Joy with java");   // String argument
        aObj.genericPrint(3.1412343);         // double argument
    }
}
