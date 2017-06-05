
package iterator.pattern;

/**
 * project name: Design_Pattern
 * package name: iterator.pattern
 * file name: NameRepository.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:52:34 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
public class NameRepository implements Container {
   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }		
   }
}