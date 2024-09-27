import java.util.*;

class a{
  static <T> void genericPrint(T t){
    System.out.println(t.getClass().getName()+":"+t);
}
  public static void main(String[] args){
    genericPrint(10);
    
  }
}
    ￼Enter
