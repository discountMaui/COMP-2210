import java.util.Iterator;
/**
* driver class.
*/
public class LinkedSetdr {
 
   public static void main(String[] args) {
   
      LinkedSet<Integer> a = new LinkedSet<Integer>();
      a.add(100);
      a.add(1);
      a.add(2);
      a.add(3);
      a.add(4);
      a.add(5);
      a.remove(1);
      Iterator<Set<Integer>> powerSet = a.powerSetIterator();
      while (powerSet.hasNext()) {
         System.out.print(powerSet.next());
      }
     
   }
}