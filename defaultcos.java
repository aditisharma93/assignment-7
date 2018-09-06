import java.util.*;
import java.lang.*;
class abc
{
    abc()
    {
     System.out.println("Parent constructor called!");   
    }
    abc(int a)
    {
      this();
    }
}
class  DefaultCons{
    public static void main(String [] aa){
       abc c=new abc(10);
    }
}