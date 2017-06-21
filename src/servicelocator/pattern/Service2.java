
package servicelocator.pattern;

/**
 * project name: Design_Pattern
 * package name: servicelocator.pattern
 * file name: Service2.java
 * project version: default
 * Created:
 * Jun 21, 2017, 11:35:02 AM
 * @author bumerang
 */
// https://www.tutorialspoint.com/design_pattern/service_locator_pattern.htm
public class Service2 implements Service {
   @Override
   public void execute(){
      System.out.println("Executing Service2");
   }

   @Override
   public String getName() {
      return "Service2";
   }
}