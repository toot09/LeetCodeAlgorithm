import java.util.*;

class Main {
  
  public static void main(String[] args) {

    System.out.println("##### Start! #####");
   
    MyHashSet_Node hashSet = new MyHashSet_Node();
    hashSet.add(1);         
    hashSet.add(2); 
    System.out.println(hashSet.contains(1));    // returns true
    System.out.println(hashSet.contains(3));    // returns false (not found)
    hashSet.add(2);          
    System.out.println(hashSet.contains(2));    // returns true
    hashSet.remove(2);          
    System.out.println(hashSet.contains(2));    // returns false (already removed)

    System.out.println("##### Compile Complete! #####");
  } 

}


