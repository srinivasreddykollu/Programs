package collections;

import java.util.*;

public class Demo1 {
    public static void main(String[] args){
        Collection obj=new ArrayList(); //collection interface
        obj.add("kollu");
        obj.add(2);
        obj.add(45);
        //this collection interface wont support adding objects with index so we can make as list interface and we can make
        //it as generic with same type of objects with
        List<Integer> obj1=new ArrayList<Integer>();
        obj1.add(8);
        obj1.add(56);
        obj1.add(1,80);
        Collections.sort(obj1);


      Iterator i1= obj1.iterator();
       while(i1.hasNext()){
           System.out.println(i1.next());
        }
           for(Object i : obj){
               System.out.println(i);
           }
    }
}
