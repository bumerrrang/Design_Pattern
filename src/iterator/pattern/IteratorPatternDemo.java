
package iterator.pattern;

/**
 * project name: Design_Pattern
 * package name: iterator.pattern
 * file name: IteratorPatternDemo.java
 * project version: default
 * Created:
 * Jun 5, 2017, 10:53:22 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      } 	
   }
}