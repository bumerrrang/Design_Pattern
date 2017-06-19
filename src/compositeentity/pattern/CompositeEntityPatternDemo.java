
package compositeentity.pattern;

/**
 * project name: Design_Pattern
 * package name: compositeentity.pattern
 * file name: CompositeEntityPatternDemo.java
 * project version: default
 * Created:
 * Jun 19, 2017, 11:13:57 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/composite_entity_pattern.htm
public class CompositeEntityPatternDemo {
   public static void main(String[] args) {
   
       Client client = new Client();
       client.setData("Test", "Data");
       client.printData();
       client.setData("Second Test", "Data1");
       client.printData();
   }
}