import java.util.*;
import java.lang.*;
import java.io.*;
class prnt{
 int a=10;
  public void prt(){
    System.out.println(" Function is called from parent class " +a);
  }
}
class Child extends prnt{
  Child(){
    super.prt();
  }
}
class extend{
  public static void main(String [] args){
    Child cc=new Child();
  }
}
