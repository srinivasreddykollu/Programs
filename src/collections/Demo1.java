package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class Demo1 {
    public static void main(String[] args){
        Collection obj=new ArrayList(); //collection interface
        obj.add("kollu");
        obj.add(2);
        obj.add(45);
     //  Iterator i= obj.iterator();
     //   while(i.hasNext()){
        //    System.out.println(i.next());
      //  }
           for(Object i : obj){
               System.out.println(i);
           }
    }
}
